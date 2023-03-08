package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Main {
   private  Map<Integer, Ubicacion> ubicaciones = new HashMap<>();


    public Main() {
        Ubicacion montaña = new Ubicacion(1,"Estás en la cima de la montaña");
        Ubicacion playa = new Ubicacion(2,"Estás bañandote en la playa");
        Ubicacion edificio = new Ubicacion(3,"Estás dentro de un edificio muy alto");
        Ubicacion puente = new Ubicacion(4,"Estas de pie en un puente");
        Ubicacion bosque = new Ubicacion(5,"Estás en un bosque");
        ubicaciones.put(1,montaña);
        ubicaciones.put(2,playa);
        ubicaciones.put(3,edificio);
        ubicaciones.put(4,puente);
        ubicaciones.put(5,bosque);
        montaña.addExit("N",5);
        montaña.addExit("O",2);
        montaña.addExit("S",4);
        montaña.addExit("E",3);
        playa.addExit("N",5);
        playa.addExit("S",4);
        playa.addExit("E",1);
        edificio.addExit("O",1);
        puente.addExit("N",1);
        puente.addExit("O",2);
        bosque.addExit("O",2);
        bosque.addExit("S",1);
    }


    public static void main(String[] args) {



//main
    }

    //class
}
