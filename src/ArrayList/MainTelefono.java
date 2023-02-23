package ArrayList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainTelefono {

    private static TelefonoMovil miTelefono = new TelefonoMovil("666222333");
    private static Scanner sc = new Scanner(System.in);


    public static void imprimirMenu(){
        System.out.println("----- MENU PRINCIPAL -----");
        System.out.println("0  --  Salir");
        System.out.println("1  --  Imprimir contactos");
        System.out.println("2  --  Agregar nuevo contacto");
        System.out.println("3  --  Actualizar contacto existente");
        System.out.println("4  --  Eliminar contacto");
        System.out.println("5  --  Buscar contacto");
        System.out.println("6  --  Imprimir menu principal");
    }

    public static void anyadirContacto(){
        System.out.println("Introduce el nombre del contacto:");
        sc.nextLine();
        String nombre=sc.nextLine();
        System.out.println("Introduce el número del contacto:");
        String telefono=sc.nextLine();
        Contacto alfa = new Contacto(nombre,telefono);

        miTelefono.addNewContact(alfa);
    }

    public static void actualizarContacto(){
        System.out.println("Introduce el nombre del contacto a modificar:");
        sc.nextLine();
        String nombre=sc.nextLine();
        Contacto posicion = miTelefono.queryContact(nombre);
        if (posicion !=null){
            System.out.println("Introduce el nuevo nombre del contacto:");
            String neoNombre=sc.nextLine();
            System.out.println("Introduce el nuevo número del contacto:");
            String telefono=sc.nextLine();
            Contacto alfa = new Contacto(neoNombre,telefono);
            miTelefono.updateContact(posicion,alfa);
        }
    }


    public static void main(String[] args) {

boolean continuar = true;
int opcion=0;
imprimirMenu();

while (continuar==true){
    System.out.println("Elige una opción: ");
    opcion = sc.nextInt();

    switch (opcion) {
        case 0:
            continuar=false;
            break;

        case 1:
            miTelefono.imprimirContactos();
            break;

        case 2:
            anyadirContacto();
            break;

        case 3:
            actualizarContacto();
            break;

     //switch
    }
    //while
}





        //main
    }



    //class
}
