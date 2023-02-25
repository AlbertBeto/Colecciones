package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        Album vietnamSongs = new Album("Vietnam Songs","Multiples");
        Album albert2 = new Album("Albert", "Beto");


        vietnamSongs.addSong("White Rabbit",3.55);
        vietnamSongs.addSong("House Of The Rising Sun", 4.31);
        vietnamSongs.addSong("Fortunate son", 2.17);

        albert2.addSong("Punk Rock Loser",12.00);
        albert2.addSong("Smoko", 2.22);
        albert2.addSong("Jolly F*cker", 1.32);


        LinkedList<Cancion> listaReproduccion = new LinkedList<Cancion>();


        albert2.addToPlayList(1,listaReproduccion);
        albert2.addToPlayList(2,listaReproduccion);
        albert2.addToPlayList(3,listaReproduccion);

        vietnamSongs.addToPlayList("Punk Rock Loser",listaReproduccion);
        vietnamSongs.addToPlayList("Smoko",listaReproduccion);
        vietnamSongs.addToPlayList("Jolly F*cker",listaReproduccion);




        boolean continuar = true;
        int opcion=0;
        imprimirMenu();

        while (continuar==true){
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    continuar=false;
                    break;

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    imprimeListaRepro(listaReproduccion);
                    break;

                case 5:
                    imprimirMenu();
                    break;

                case 6:

                    break;

                //switch
            }
            //while
        }




        //main
    }



    //class
}
