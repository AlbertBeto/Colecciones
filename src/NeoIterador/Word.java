package NeoIterador;


// Tenemos un atributo String llamado term
// constructor se le pasa un texto, asigna a la variable term, lo que devuelve validation
//de ese texto.

// tendré un metodo estatico llamado validation que se le pasa un String
// y devuelve un string. Valida que el string que se me pasa esa una palabra.
//hola mundo ---> hola
// si el texto que me pasan está vacio o es nulo devuelvo ""


public class Word {

    private String term;





    public Word(String texto) {
        this.term=validation(texto);

    }

    public static String validation(String texto) {
        if (texto != null && !texto.isEmpty()) {
            int index = texto.indexOf(" ");
            if (index == -1) {
                return texto;
            } else {
                return texto.substring(0, index);

            }
        }
        return "";
    }

        public String getTerm() {
            return term;
        }

    @Override
    public String toString() {
        return getTerm();
    }
//class
}


