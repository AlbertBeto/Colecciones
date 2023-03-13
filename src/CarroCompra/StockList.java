package CarroCompra;

import java.util.HashMap;
import java.util.Map;

/**
 * Usaremos un mapa para almacenar el stock o existencias de articulos
 * Nombre será la Key o clave del mapa.(usamos el nombre pork es lo que usamos para saber si dos objetos son
 iguales) y el
 * valor será el artículo
 *
 * En el constructor inicializamos el mapa
 * Métodos:
 * -addStock, recibe un artículo, comprueba que existe en el mapa,si existe ajusta el stock de ese artículo y si no
 existe simplemente lo añade
 * y devuelve el stock de ese artítulo tb. si es null devuelvo 0.
 *
 * -sellStock, se le pasa nombre y una cantidad, devuelve un entero.
 * primero compruebo si existe el articulo en mi existencia de artículos.Se comprueba que puedo ofrecer esa
 cantidad de stock.
 * Si puedo vender hay que actualizar el stock del inventario.Si no existe o no queda en inventario comunicamos
 que no existe el producto y devolvemos un 0.
 *
 * -get, le pasamos un nombre de artículo y nos devuelve un Artículo dentro de mis existencias
 *
 * -toString:Lista de artículos:\n
 * artículo. total de valor de uds juntas
 * por ejemplo Leche:1.99 Total 58.99(esto es uds por precio)
 * Tomate frito:0.75 total 5.00
 * ...
 * valor todas de existencias es de 50.000 por ejemplo(suma de todo el inventario del mapa).
 *
 *
 */
public class StockList {

    private Map<String, Articulo> existencias;

    public StockList(){
        this.existencias = new HashMap<>();
    }

    public int addStock(Articulo articulo){
        if (articulo != null){
            Articulo a = existencias.get(articulo.getNombre());
            if (a != null){
                articulo.ajustarStock(a.getStock());
            }
            existencias.put(articulo.getNombre(), articulo);
            return articulo.getStock();
        }
        return 0;
    }

    // ********************************************************************* //
    // Reduce el stock.
    public int sellStock(String nombre, int cantidad){
        Articulo a = existencias.get(nombre);
        if (a != null && cantidad > 0 && a.getStock() >= cantidad){
            a.ajustarStock(-cantidad);
            return cantidad;
        }
        return 0;
    }

    @Override
    public String toString() {
        String s = "Lista de articulos: \n";
        double costeTotal=0;
        for (Articulo a: existencias.values()){
            double costeArt = a.getStock()* a.getPrecio();
            s +=a + ". Total " + costeArt + "\n";
            costeTotal += costeArt;
        }
        s+="Valor total de existencias " + costeTotal;
        return s;
    }

    public Articulo get(String nombre){
        return existencias.get(nombre);
    }


    //class
}

