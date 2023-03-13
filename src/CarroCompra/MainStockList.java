package CarroCompra;

/**
 * Creamos un atributo estático de CarroCompra. StockList y lo inicializamos.
 *
 * Método:
 * -sellItem(CarroCompra. Cesta cesta, String nombreArticulo, int cantidad)
 * Primero extraemos el artículo de la lista de existencias, si el artículo no existe mostramos el mensaje; No vendemos ese artículo.
 * Si existe el artículo, llamo sellStock de ese artículo, si no he podido vender devuelve un 0. Si puedo vender el
 * artículo, lo añado a la cesta y devolvemos la cantidad que vamos a vender.
 * -main: nos creamos unos entre tres y cinco artículos, para cada artículo cojo mi objeto de stockList y llamo a addStock (art1),
 * addStock(art2).
 * nos creamos un objeto cesta, "cesta de Albert".
 * y luego llamaremos al método sellItem(cestaAlbert, "Queso", 1);
 * llamamos al método sellItem varias veces, hasta quedarme sin stock.
 *
 */

public class MainStockList {

private static StockList stockList = new StockList();

public static int sellItem(Cesta cesta, String nombre, int cantidad){
    Articulo articulo = stockList.get(nombre); //compruebo mi existencia si tengo ese articulo.
    if(articulo == null){
        System.out.println("No vendemos ese artículo.");
        return 0;
    } else{
        if (stockList.sellStock(nombre,cantidad) !=0){
            cesta.addCesta(articulo,cantidad);
            return cantidad;
        }
        return 0;
    }
}

    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Leche", 1.98, 4);
        Articulo articulo2 = new Articulo("Pan", 0.98, 10);
        Articulo articulo3 = new Articulo("Queso", 2.54, 2);
        Articulo articulo4 = new Articulo("Carne", 3.25, 3);

        stockList.addStock(articulo1);
        stockList.addStock(articulo2);
        stockList.addStock(articulo3);
        stockList.addStock(articulo4);

        Cesta cesta = new Cesta("CarroCompra.Cesta de Patricia");
        sellItem(cesta,"Queso",1);
        sellItem(cesta,"Queso",1);
// comprobamos qué pasa si no queda algo.
        sellItem(cesta,"Queso",6);
        sellItem(cesta,"Vieras",6);

        System.out.println("");
        System.out.println(stockList.toString());
        //main
    }



//class
}
