package NeoIterador;

import java.util.Scanner;

public class MenuWords {

    private static final Scanner sc = new Scanner(System.in);
    private static final WordList words = new WordList();

    public static void menu(){

        System.out.println("0 - Salir\n" + "1 - Imprimir lista");

    }


    public static void main(String[] args) {
        Word hola = new Word("Hola caracola");
        words.addWord(hola);

        boolean continuar = true;

        do {
            menu();
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 0:
                    continuar=false;
                    break;

                case 1:
                    System.out.println(words.toString());
                    break;

                case 2:
                    words.addWord(new Word(sc.nextLine()));
                    break;

                case 3:


            }

        }while (continuar==true);





        //main
    }



    //class
}
