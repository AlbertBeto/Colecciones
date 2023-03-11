package Set;

public class Planeta extends CuerpoCeleste {

    public Planeta(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);
    }

    public boolean addSatelite(CuerpoCeleste alfa) {
        if (alfa.getTipoCuerpo().equals("Luna")) {
            return addSatelite(alfa);
        } else {
            System.out.println("El cuerpo escogido no es una luna.");
            return false;
        }
    }

    //class
}
