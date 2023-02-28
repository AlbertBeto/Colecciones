package NeoIterador;

//Un atributo LinkedList de Word la llamamos words

//Constructor, construyo la lista vacia

// Método: addWord(Word word) --> añade palabra a la lista.


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

    public void deleteDotWords(){


        for (ListIterator<Word> it = words.listIterator();it.hasNext();){
            String word = it.next().getTerm();
            if(word.endsWith(".")){
                it.remove();
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }else if (word.endsWith(",")){
                it.remove();
                if(it.hasPrevious()){
                    it.previous();
                    it.remove();
                }
            }

        }
    }

    //metodo: si una palabras acaba en . y la siguiente no empieza en mayúsculas
    // elimino las dos.

    public void deleteFinalWordWithDot(){
//
// Character.isUpperCase(text.charAt(0));


        for (ListIterator<Word> it = words.listIterator();it.hasNext();){
            String word = it.next().getTerm();
            if(it.hasNext()){
                String wordNext = it.next().getTerm();


                if (word.endsWith(".") && !Character.isUpperCase(wordNext.charAt(0))){
                    it.previous();
                    it.previous();
                    it.remove(); //borra hola.
                    it.next();
                    it.remove();
                }
            }
            }


    }


    //class
}
