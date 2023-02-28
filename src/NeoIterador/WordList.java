package NeoIterador;

//Un atributo LinkedList de Word la llamamos words

//Constructor, construyo la lista vacia

// Método: addWord(Word word) --> añade palabra a la lista.


import java.util.Iterator;
import java.util.LinkedList;

public class WordList {

    private LinkedList words;

    public WordList() {
        words = new LinkedList<>();
    }

    public void addWord(Word word){
    words.add(word);

    }

    //sobreescribir o anular --> toString(): devuelve el texto con todas las palabras
    // separadas por un unico espacio. Compruebo si la lista está vacia devuelvo:
    // -------- Lista vacia ---------

    @Override
    public String toString() {
        if (words == null || words.isEmpty()) {
            return "-------- Lista vacia ---------";
        } else {
            StringBuilder sb = new StringBuilder();

            Iterator<Word> it = words.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString()).append(' ');
            }
            return sb.toString();
        }


    }

    //metodo, elimina palabras tipo: palabra-exit

    public void removeExtraneousWords(){

        // Esto es el while pero en for.....
        for(Iterator<Word> it = words.iterator(); it.hasNext();){
            String word = it.next().getTerm();
            if (word.contains("-")){
                it.remove();
            }
        }


    }

//metodo, si una palabra acaba en ., borro esa palabra y la siguiente
    // si una palabra acaba en  , borro esa palabra y la anterior.

    //class
}
