package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class MainLinkedList {

    public static void imprimeListaRepro(LinkedList<Cancion> listaReproduccion) {
        Iterator<Cancion> it = listaReproduccion.iterator();
        while (it.hasNext()) {
            System.out.println(it.toString()+it.next());
        }
        System.out.println("-----");
    }

    public static void imprimirMenu(){
        System.out.println("----- MENU PRINCIPAL -----");
        System.out.println("0  --  Salir de la lista de reproducción");
        System.out.println("1  --  Reproducir siguiente canción en la lista");
        System.out.println("2  --  Reproducir la canción previa de la lista");
        System.out.println("3  --  Repetir la canción actual");
        System.out.println("4  --  Imprimir la lista de canciones en la playlist");
        System.out.println("5  --  Volver a imprimir el menú");
        System.out.println("6  --  Eliminar canción actual de la lista");
    }

    public static void play(){


    }

    public static void main(String[] args) {

        Album vietnamSongs = new Album("White Rabbit","Jefferson Airplane");

        Album albert2 = new Album("Albert", "Beto");


        Cancion aa = new Cancion("Beto Wins", 12.03);
        Cancion ab = new Cancion("Charly Wins", 4.03);

        Cancion ac = new Cancion("Mai Wins", 2.22);
        Cancion ad = new Cancion("Like Rolling Stone", 1.32);
        Cancion ae = new Cancion("All toguether", 4.53);

        vietnamSongs.canciones.add(aa);
        vietnamSongs.canciones.add(ab);
        albert2.canciones.add(ac);
        albert2.canciones.add(ad);
        albert2.canciones.add(ae);

        System.out.println(vietnamSongs.canciones.get(1).toString());


        LinkedList<Cancion> listaReproduccion = new LinkedList<Cancion>();

        albert2.addToPlayList(1,listaReproduccion);
        vietnamSongs.addToPlayList("Charly Wins",listaReproduccion);

imprimeListaRepro(listaReproduccion);


imprimirMenu();






        //main
    }



    //class
}
