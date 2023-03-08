package Final;

public class Password {
    private final int password=67294358;
    private final int passEncriptada;

    protected Password(int pass){
        passEncriptada=encriptDesencrip(pass);
    }

    private int encriptDesencrip(int pass){
        return pass ^ password;
    }

    protected void guardarContraseña(){
        System.out.println("La contraseña se ha guardado como "+passEncriptada );
    }

    protected boolean iniciarSesion(int pass){
        int neoPassEncrip=encriptDesencrip(pass);
        if (neoPassEncrip == passEncriptada){
            System.out.println("Bienvenido");
            return true;
        }else{
            System.out.println("Error al iniciar sesión. Contraseña incorrecta");
            return false;
        }

    }

}


