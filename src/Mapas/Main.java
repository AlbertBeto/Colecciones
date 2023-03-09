package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
   private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();


    public Main() {
        Ubicacion exit = new Ubicacion(0,"Estás sentado en la clase de programación");
        Ubicacion montaña = new Ubicacion(1,"Estás en la cima de la montaña");
        Ubicacion playa = new Ubicacion(2,"Estás bañandote en la playa");
        Ubicacion edificio = new Ubicacion(3,"Estás dentro de un edificio muy alto");
        Ubicacion puente = new Ubicacion(4,"Estas de pie en un puente");
        Ubicacion bosque = new Ubicacion(5,"Estás en un bosque");
        ubicaciones.put(0,exit);
        ubicaciones.put(1,montaña);
        ubicaciones.put(2,playa);
        ubicaciones.put(3,edificio);
        ubicaciones.put(4,puente);
        ubicaciones.put(5,bosque);
        montaña.addExit("N",5);
        montaña.addExit("O",2);
        montaña.addExit("S",4);
        montaña.addExit("E",3);
        montaña.addExit("Q",0);
        playa.addExit("N",5);
        playa.addExit("S",4);
        playa.addExit("E",1);
        playa.addExit("Q",0);
        edificio.addExit("O",1);
        edificio.addExit("Q",0);
        puente.addExit("N",1);
        puente.addExit("O",2);
        bosque.addExit("O",2);
        bosque.addExit("S",1);
        bosque.addExit("Q",0);
    }


    public static void main(String[] args) {
        Ubicacion exit = new Ubicacion(0,"Estás sentado en la clase de programación");
        Ubicacion montaña = new Ubicacion(1,"Estás en la cima de la montaña");
        Ubicacion playa = new Ubicacion(2,"Estás bañandote en la playa");
        Ubicacion edificio = new Ubicacion(3,"Estás dentro de un edificio muy alto");
        Ubicacion puente = new Ubicacion(4,"Estas de pie en un puente");
        Ubicacion bosque = new Ubicacion(5,"Estás en un bosque");
        ubicaciones.put(0,exit);
        ubicaciones.put(1,montaña);
        ubicaciones.put(2,playa);
        ubicaciones.put(3,edificio);
        ubicaciones.put(4,puente);
        ubicaciones.put(5,bosque);
        montaña.addExit("N",5);
        montaña.addExit("O",2);
        montaña.addExit("S",4);
        montaña.addExit("E",3);
        montaña.addExit("Q",0);
        playa.addExit("N",5);
        playa.addExit("S",4);
        playa.addExit("E",1);
        playa.addExit("Q",0);
        edificio.addExit("O",1);
        edificio.addExit("Q",0);
        puente.addExit("N",1);
        puente.addExit("O",2);
        bosque.addExit("O",2);
        bosque.addExit("S",1);
        bosque.addExit("Q",0);
        Scanner sc = new Scanner(System.in);

        int salida=1;
        while(salida!=0){
            System.out.println(ubicaciones.get(salida).descripcion);
            System.out.println("Tus salidas son "+ubicaciones.get(salida).getExits());
            String entrada  = sc.nextLine();
            String camino=entrada.toUpperCase();
            if (ubicaciones.get(salida).exits.containsKey(camino)){
            salida=ubicaciones.get(salida).exits.get(camino);}
            else{
                System.out.println("No puede ir a esa dirección.");
            }

        //while
        }
        System.out.println(ubicaciones.get(salida).descripcion);

//main
    }

    //class
}
