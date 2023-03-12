package CarroCompra;
/*
import java.util.HashMap;
import java.util.Map;

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
*/
