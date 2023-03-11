package Set;

import java.util.HashSet;
import java.util.Set;

public class CuerpoCeleste {

    public enum TipoCuerpoCeleste{

        ESTRELLA,PLANETA,PLANETA_ENANO,LUNA,COMETA,ASTEROIDE
    }

    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        Set satelites = new HashSet();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public HashSet<CuerpoCeleste> getSatelites() {
        HashSet alfa = new HashSet<>();
        alfa = (HashSet) satelites;
        return alfa;
    }

    public boolean addSatelite(CuerpoCeleste crear){
        if (satelites.contains(crear)){
            System.out.println("Ya existe este cuerpo celeste");
            return false;
        }else{
            satelites.add(crear);
            System.out.println("Se ha añadido el cuerpo celeste"+crear);
            return true;
        }
    }

    public boolean equals(CuerpoCeleste alfa, CuerpoCeleste bravo){
        if(alfa.nombre.equals(bravo.nombre)&&alfa.tipoCuerpo.equals(bravo.tipoCuerpo)){
            System.out.println("Los cuerpos comparados son iguales.");
            return true;
        }else{
            System.out.println("Los cuerpos comparados no son iguales.");
            return false;
        }
    }


    public int hashCode(CuerpoCeleste alfa) {
        return alfa.nombre.hashCode()+alfa.tipoCuerpo.hashCode()+33;

    }

    @Override
    public String toString() {
        return nombre + ": "+ tipoCuerpo+
                ", " + periodoOrbital;
    }

    //class
}
