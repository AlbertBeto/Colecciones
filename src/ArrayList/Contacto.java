package ArrayList;

public class Contacto {

    private String name;
    private String phoneNumber;

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public static Contacto createContact(String name, String phoneNumber){
        Contacto alfa = new Contacto(name,phoneNumber);
        return alfa;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    //class
}
