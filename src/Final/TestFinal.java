package Final;

public class TestFinal {
    public static final String NOMBRE;
    public static String mystr;

    static {
        NOMBRE = "Patricia";
        System.out.println("1º bloque. Inicializa el nombre");
        mystr = "Bolck1";
    }

    public TestFinal(){
        System.out.println("Entra en el constructor");
    }

    static {
        System.out.println("2º bloque estático de inicialización");
        mystr = "Block2";
    }

    public void metodo(){
        System.out.println("Entra en el método");
    }

}
