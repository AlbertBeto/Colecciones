package Set;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainSet {

    public static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();


    public static void main(String[] args) {

        CuerpoCeleste Mercurio = new CuerpoCeleste("Mercurio",88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Venus = new CuerpoCeleste("Venus",225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Tierra = new CuerpoCeleste("La Tierra",365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Marte = new CuerpoCeleste("Marte",687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Jupiter = new CuerpoCeleste("Jupiter",4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Saturno = new CuerpoCeleste("Saturno",10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Urano = new CuerpoCeleste("Urano",30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Neptuno = new CuerpoCeleste("Neptuno",165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Pluton = new CuerpoCeleste("Pluton",248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(Mercurio.getNombre(),Mercurio);
        sistemaSolar.put(Venus.getNombre(),Venus);
        sistemaSolar.put(Tierra.getNombre(),Tierra);
        sistemaSolar.put(Marte.getNombre(),Marte);
        sistemaSolar.put(Jupiter.getNombre(),Jupiter);
        sistemaSolar.put(Saturno.getNombre(),Saturno);
        sistemaSolar.put(Urano.getNombre(),Urano);
        sistemaSolar.put(Neptuno.getNombre(),Neptuno);
        sistemaSolar.put(Pluton.getNombre(),Pluton);
        planetas.add(Mercurio);
        planetas.add(Venus);
        planetas.add(Tierra);
        planetas.add(Marte);
        planetas.add(Jupiter);
        planetas.add(Saturno);
        planetas.add(Urano);
        planetas.add(Neptuno);
        planetas.add(Pluton);


        CuerpoCeleste Luna = new CuerpoCeleste("Luna",27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(Luna.getNombre(), Luna);
        Tierra.addSatelite(Luna);

        CuerpoCeleste Deimos = new CuerpoCeleste("Deimos-1",3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Phobos = new CuerpoCeleste("Phobos-0",3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(Deimos.getNombre(), Deimos);
        sistemaSolar.put(Phobos.getNombre(), Phobos);
        Marte.addSatelite(Deimos);
        Marte.addSatelite(Phobos);

        CuerpoCeleste Io = new CuerpoCeleste("Io-1",8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Europa = new CuerpoCeleste("Europa-3",5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Ganymedes = new CuerpoCeleste("Ganymedes-7",1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        CuerpoCeleste Callisto = new CuerpoCeleste("Callisto-16",7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(Io.getNombre(), Io);
        sistemaSolar.put(Europa.getNombre(), Europa);
        sistemaSolar.put(Ganymedes.getNombre(), Ganymedes);
        sistemaSolar.put(Callisto.getNombre(), Callisto);
        Jupiter.addSatelite(Io);
        Jupiter.addSatelite(Europa);
        Jupiter.addSatelite(Ganymedes);
        Jupiter.addSatelite(Callisto);

        System.out.println("");
        System.out.println("Los planetas del sistema Solar");
        for (CuerpoCeleste planetas: planetas) {
            System.out.println(planetas.getNombre());
        }

        System.out.println("");
        System.out.println("Lunas de Marte");
        for(CuerpoCeleste lunasMarte : Marte.getSatelites()){
            System.out.println(lunasMarte.getNombre());
        }


        Set<CuerpoCeleste> todasLunas = new HashSet<>();
        for (CuerpoCeleste buscandoLunas: planetas) {
            if (buscandoLunas.getSatelites()!=null){
                for (CuerpoCeleste metiendoLunas : buscandoLunas.getSatelites()) {
                    todasLunas.add(metiendoLunas);
                }
            }
        }

        System.out.println("");
        System.out.println("Todas las lunas del sistemas Solar.");
        for (CuerpoCeleste luna: todasLunas) {
            System.out.println(luna.getNombre());
        }

        System.out.println("");
        System.out.println("Probando el toString modificado ");
        CuerpoCeleste Pluton884 = new CuerpoCeleste("Pluton-884",248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        planetas.add(Pluton884);

        for (CuerpoCeleste planetas: planetas) {
            System.out.println(planetas.toString());
        }


//main
    }



    //class
}
