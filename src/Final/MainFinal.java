package Final;

public class MainFinal {
    public static void main(String[] args) {
        Password pass = new Password(22334455);
        pass.guardarContraseña();
        pass.iniciarSesion(223344);
        pass.iniciarSesion(22334455);
        pass.iniciarSesion(1121212);
        System.out.println("");
        PasswordAmpliada neoPass = new PasswordAmpliada(1122);
        neoPass.guardarContraseña();
        neoPass.iniciarSesion(223344);
        neoPass.iniciarSesion(22334455);
        neoPass.iniciarSesion(1122);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        TestFinal testFinal = new TestFinal();
        testFinal.metodo();
        System.out.println("Nombre:" + TestFinal.NOMBRE);
        System.out.println("Valor de mystr" + TestFinal.mystr);


    }
    //class
}
