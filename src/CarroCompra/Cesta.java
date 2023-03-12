package CarroCompra;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase es para almacenar mi cesta de pedidos
 * tendremos un atributo nombre y un mapa que será la lista de pedidos, tendrá clave o key un artículo y un valor
 entero
 * que es la cantidad de productos que se compran de ese artículo
 * -Constructor: nombre por parámetro y el mapa se inicializa en el constructor.mapa de String nombre y uds con
 Integer
 * -métodos
 * -addCesta se le pasa un artículo y una cantidad.Primero comprobamos que artículo no sea null y la cantidad a
 comprar
 * sea mayor a 0, si no es mayor a 0 devuelvo 0.(compruebo si ya lo he pedido, para actualizar esa cantidad si no
 * lo añado con la cantidad que me pasan.Devuelvo la cantidad que voy a comprar.
 * -ToString queremos que salga lo siguiente
 * "La cesta de la compra contiene X artículos.\n
 * Leche:1.99 7uds compradas y el total de las uds por ejemplo 14.99
 * Patatas:0.50 10 uds compradas por ejemplo 5.00
 * etc...
 * Valor total del carrito 19.99"
 */

public class Cesta {

    private String nombre;
    private Map<Articulo, Integer> listaPedidos;

    public Cesta(String nombre){
        this.nombre = nombre;
        this.listaPedidos = new HashMap<>();
    }

    public int addCesta(Articulo articulo, int cantidad){
        if(articulo != null && cantidad >0){
            int cantidadActual = listaPedidos.getOrDefault(articulo,0);
            listaPedidos.put(articulo, cantidadActual + cantidad);
            return cantidad + cantidadActual;
        }
        return 0;
    }

    @Override
    public String toString() {
       String s = "La cesta de la compra contiene " + listaPedidos.size() + " articulo. \n";
       double costeTotal = 0;
       for(Map.Entry<Articulo, Integer> entradaMapa: listaPedidos.entrySet()){
           double costeAr = entradaMapa.getKey().getPrecio()*entradaMapa.getValue();
           s+= entradaMapa.getKey() + ". " + entradaMapa.getValue() + " adquiridos, coste" + costeAr + "\n";
           costeTotal+=costeAr;
       }
       s+= "Valor total del carrito " + costeTotal;
       return s;
    }

    //class
}

