package Final;

public class PasswordAmpliada extends Password {
    private final int passDesencriptada;
    protected PasswordAmpliada(int pass) {
        super(pass);
        this.passDesencriptada = pass;
    }
    @Override
    protected void guardarContraseña() {
        System.out.println("La contraseña se ha guardado como "+passDesencriptada );
    }
}
