package CarroCompra;

import java.util.HashMap;
import java.util.Map;

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
        double costaTotal=0;
        for (Articulo a: existencias.values()){
            double caosteArt = a.getStock()* a.getPrecio();
            s +=a + ". Total " + costeArt + "\n";
            costaTotal += costeArt;
        }
        s+="Valor total de existencias " +
    }

    public Articulo get(String nombre){
        return existencias.get(nombre);
    }


    //class
}
