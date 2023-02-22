import ArrayList.Contacto;
import ArrayList.TelefonoMovil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TelefonoMovil mio =new TelefonoMovil("666999333");


mio.imprimirArrayList();
        Contacto jar = new Contacto("Jarrr", "22223333444");
        Contacto per = new Contacto("Per", "414444545");
        Contacto bal = new Contacto("Bal", "2222555454545");

        mio.addNewContact(jar);
        mio.addNewContact(per);
        mio.imprimirArrayList();
        mio.addNewContact(jar);

        mio.updateContact(jar,bal);
        mio.addNewContact(jar);
        mio.removeContact(jar);

        mio.queryContact("Beto");
        mio.imprimirContactos();

    //main
    }

    //class
}