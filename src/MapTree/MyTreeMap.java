package MapTree;

import java.util.*;

public class MyTreeMap {

public static Map<String, String> colores = new HashMap<>();

public static TreeMap<String, String> neoColores = new TreeMap<>();


public static void imprimeMap(Map<String,String> alfa){
    for (String tree: alfa.keySet()) {
        System.out.println(tree+" --> "+alfa.get(tree));
    }
}

public static void copiaTreeMap(TreeMap<String,String> alfa){
    alfa.putAll(colores);
}

public static boolean confirmarKey(String alfa){
    if(colores.containsKey(alfa)){
        System.out.println("El map contiene la Key consultada");
        return true;
    }else{
        System.out.println("El map NO contiene la Key consultada");
        return false;
    }
}

    public static boolean confirmarValue(String alfa){
        if(colores.containsValue(alfa)){
            System.out.println("El map contiene el valor consultado");
            return true;
        }else{
            System.out.println("El map NO contiene la valor consultado");
            return false;
        }
    }

    public static void imprimeInverso(TreeMap<String,String> bravo) {
    for (String key: bravo.descendingKeySet()) {
            System.out.println(key + " -- >"+bravo.get(key));
        }
}

    static class  SortMyTreeMap implements Comparator<TreeMap<String,String>> {
        @Override
        public int compare(TreeMap<String, String> o1, TreeMap<String, String> o2) {
            return 0;
        }
    }

    /*
    static void giradorTree (TreeMap<String,String> alfa){
       // TreeMap<String, String> comp = (TreeMap<String, String>) alfa.comparator();
    //imprimeTree(comp);
    }
    */


    public static String clavePrimera(TreeMap<String,String> alfa){
        return alfa.firstKey();
    }

    public static String claveUltima(TreeMap<String,String> alfa){
        return alfa.lastKey();
    }


    public static void claveValorMayor(TreeMap<String,String> alfa){
        String clave = claveUltima(alfa);
        System.out.println(clave+" --> "+alfa.get(clave));

    }

    public static void claveValorMenor(TreeMap<String,String> alfa){
        String clave = clavePrimera(alfa);
        System.out.println(clave+" --> "+alfa.get(clave));

    }


    public static void main(String[] args) {
        colores.put("C1","Rojo");
        colores.put("C2","Azul");
        colores.put("C3","Verde");
        colores.put("C4","Blanco");
        colores.put("C5","Negro");

imprimeMap(colores);


        copiaTreeMap(neoColores);
        System.out.println(" ");
        imprimeMap(neoColores);


        System.out.println("");
        System.out.println(clavePrimera(neoColores));
        System.out.println("");
        System.out.println("inverso");
        imprimeInverso(neoColores);

        System.out.println("");
        System.out.println("Clave con Mayor valor");
claveValorMayor(neoColores);
        System.out.println("");
        System.out.println("Clave con menor valor");
        claveValorMenor(neoColores);

        //main
    }


    //class
}
