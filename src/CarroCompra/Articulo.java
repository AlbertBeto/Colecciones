package CarroCompra;

import java.util.Objects;

/**
 * Vamos a almacenar la información de los artículos. Nombre, precio y cantidad de existencias(stock).
 * Dos contructores!!!
 * Construimos el objeto con nombre y precio. El stock inicialmente es de cero.
 * Construimos el constructor con los 3 atributos
 * Generamos los 3 gettes de los atributos.
 * En el sette de precio solo almacenare el precio si es mayor a cero.si no es mayor ponemos 0.
 * Metodo ajustarStock, añadir existencias al artículo, se le pasará una cantidad.
 * solo lo haré si es mayor a 0.
 * Sobrescribir equals y hascode sabiendo que (dos articulos son iguales si tienen el mismo nombre)
 * Sobrescribir el método ToString:Leche:1.99(nombre+precio)en ese formato.
 * Queremos ordenar los artículos por nombre
 */
public class Articulo implements Comparable<Articulo>{
    private String nombre;
    private double precio;
    private int stock;
    public Articulo(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Articulo(String nombre, double precio) {
        this(nombre,precio,0);
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public void setPrecio(int precio) {
        if(precio>=0) {
            this.precio = precio;
        }else
            this.precio=0;
    }
    public void ajustarStock(int cantidad){
        int stockActual=cantidad+this.stock;
        if(stockActual>=0){
            this.stock=stockActual;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(nombre, articulo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    @Override
    public String toString() {
        return "Articulo{" +
                "nombre:'" + nombre + '\'' + precio +
                '}';
    }
    @Override
    public int compareTo(Articulo o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}