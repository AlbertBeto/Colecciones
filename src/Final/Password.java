package Final;

public class Password {
    public final int password=67294358;
    public int passEncriptada;

    public Password(int pass){
        passEncriptada=encriptDesencrip(pass);
    }

    public int encriptDesencrip(int pass){
        return pass ^ password;
    }

    public void guardarContraseña(){
        System.out.println("La contraseña se ha guardado como "+passEncriptada );
    }

    public boolean iniciarSesion(int pass){
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


