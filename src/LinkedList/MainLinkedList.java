package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
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



    public static void main(String[] args) {

        Album vietnamSongs = new Album("Vietnam Songs", "Multiples");
        Album albert2 = new Album("Albert", "Beto");


        vietnamSongs.addSong("White Rabbit", 3.55);
        vietnamSongs.addSong("House Of The Rising Sun", 4.31);
        vietnamSongs.addSong("Fortunate son", 2.17);

        albert2.addSong("Punk Rock Loser", 12.00);
        albert2.addSong("Smoko", 2.22);
        albert2.addSong("Jolly F*cker", 1.32);


        LinkedList<Cancion> listaReproduccion = new LinkedList<Cancion>();


        vietnamSongs.addToPlayList(1, listaReproduccion);
        vietnamSongs.addToPlayList(2, listaReproduccion);
        vietnamSongs.addToPlayList(3, listaReproduccion);

        albert2.addToPlayList("Punk Rock Loser", listaReproduccion);
        albert2.addToPlayList("Smoko", listaReproduccion);
        albert2.addToPlayList("Jolly F*cker", listaReproduccion);

//Aqui iría el statico....

        boolean continuar = true;
        int opcion = 0;
        int numCancion=1;
        boolean haciaAdelante=true;
        Scanner sc = new Scanner(System.in);
        ListIterator<Cancion> iteradorLista = listaReproduccion.listIterator();
        imprimirMenu();
        System.out.println("Escuchando " + numCancion +" "+ iteradorLista.next());
        while (continuar == true) {
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el reproductor.");
                    continuar = false;
                    break;

                case 1:

            if (haciaAdelante==false) {

                if (iteradorLista.hasNext()){
                iteradorLista.next();}
                haciaAdelante=true;
            }
                    if (iteradorLista.hasNext()) {
                        numCancion+=1;
                System.out.println("Escuchando " + numCancion +" "+ iteradorLista.next());
            } else {
                numCancion= listaReproduccion.size();
                System.out.println("No hay mas canciones a continuación.");
            }
            break;

                    case 2:
                        if (haciaAdelante==true) {

                            if (iteradorLista.hasPrevious()){
                            iteradorLista.previous();}
                            haciaAdelante=false;
                        }
                        if (iteradorLista.hasPrevious()){
                            numCancion-=1;
                            System.out.println("Escuchando " + numCancion +" "+ iteradorLista.previous());
                        }else {
                            numCancion=1;
                        System.out.println("Esta es la primera canción, no hay anteriores.");
                            haciaAdelante=true;
                        }
                        break;

                    case 3:
                        System.out.println(iteradorLista.getClass());
                        break;

                    case 4:
                        imprimeListaRepro(listaReproduccion);
                        break;

                    case 5:
                        imprimirMenu();
                        break;

                    case 6:


                        if (iteradorLista.hasNext()) {
                            listaReproduccion.remove(numCancion-1);
                            System.out.println("Escuchando " + numCancion +" "+ listaReproduccion.get(numCancion-1));
                        } else {
                            listaReproduccion.remove(numCancion-1);
                            System.out.println("Escuchando " + numCancion +" "+ iteradorLista.previous());
                        }
                        break;

                    default:
                        System.out.println("Ha introducido un a opción equivocada.");
                        System.out.println("Por favor, vuelva a intentarlo.");
                        System.out.println("Recuerde, opción 5 para imprimir de nuevo el menu.");

                    //switch
                }
                //while
            }








        //main
    }





    //class
}
