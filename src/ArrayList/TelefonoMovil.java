package ArrayList;

import java.util.ArrayList;

public class TelefonoMovil {

    public String myNumber;

    public ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contacto>();
            }

    public boolean addNewContact(Contacto contacto){

        if(myContacts.contains(contacto)){
            System.out.println("El contacto ya existe y no se ha creado.");
            return false;
        }else{
            myContacts.add(contacto);
            System.out.println("Se ha creado el nuevo contacto.");
            return true;
        }
    }


    public boolean updateContact(Contacto viejo, Contacto nuevo){
if(findContact(viejo)==-1){
    System.out.println("El contacto a modificar no existe.");
    return false;
} else if (findContact(nuevo)>=0) {
    System.out.println("El nuevo contacto ya existe.");
    return false;
}else{
    myContacts.set(findContact(viejo), nuevo);
    System.out.println("Se ha modificado el contacto "+viejo+" por el nuevo contacto "+nuevo);
    return true;
}
    }

    public boolean removeContact(Contacto borra){
        if(findContact(borra)==-1){
            System.out.println("El contacto a borrar no existe.");
            return false;
        }else{
            myContacts.remove(findContact(borra));
            System.out.println("El contacto "+borra+" ha sido eliminado.");
            return true;
        }
    }

    private int findContact(Contacto contacto){
        int existe=myContacts.indexOf(contacto);
        if(existe>=0){
            return existe;
        }else{
            return -1;
        }
    }

    private int findContact(String nombre){
             for (int i =0;i<myContacts.size();i++){
            if(nombre.equals(myContacts.get(i).getName())){
                return i;
            }
        }
             return -1;
    }

    public Contacto queryContact(String nombre){
        int pos=findContact(nombre);
        if(pos>=0){
            return myContacts.get(pos);
        }else {
            return null;
        }
    }

public void imprimirContactos(){
    System.out.println("Lista de contactos:");
    for(int i=0;i< myContacts.size();i++){
        System.out.println((i+1)+". "+myContacts.get(i).getName()+" --> "+myContacts.get(i).getPhoneNumber());
    }
}


    public void imprimirArrayList(){
        System.out.println("Actualmente tienes "+ myContacts.size() + " contactos en tu agenda.");

        for(int i =0; i<myContacts.size();i++){
            System.out.println(myContacts.get(i));
        }
    }


    //class
}
