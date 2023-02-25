package LinkedList;

import ArrayList.Contacto;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    public String nombre;

    public String artista;

    public ArrayList<Cancion> canciones;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        canciones = new ArrayList<Cancion>();
    }

    private Cancion findsong(String titulo){
        for (int i =0;i<canciones.size();i++){
            if(titulo.equals(canciones.get(i).getTitulo())){
                return canciones.get(i);
            }
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion){
        if(findsong(titulo)!=null) {
            return false;
        }else{
            Cancion aa = new Cancion(titulo, duracion);
            canciones.add(aa);
            return true;
        }
    }

    public boolean addToPlayList(int pista, LinkedList<Cancion> listaRepro){
       if((pista-1)<0 || (pista-1)>canciones.size()){
           System.out.println("No existe");
           return false;

       }else{
           listaRepro.add(canciones.get(pista-1));
           System.out.println("existe");
           return true;
       }

    }


    public boolean addToPlayList(String titulo, LinkedList<Cancion> listaRepro){
        if(findsong(titulo)!=null) {
            listaRepro.add(findsong(titulo));
            System.out.println("existe nom");
            return true;
        }else{
            System.out.println("No existe");
            return false;
        }
    }



    //class
}
