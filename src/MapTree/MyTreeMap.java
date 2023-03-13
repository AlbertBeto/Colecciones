package MapTree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {

public static Map<String, String> colores = new HashMap<>();

public static void imprimeMap(){

    for (String tree: colores.keySet()) {
        System.out.println(tree+" --> "+colores.get(tree));
    }
}

public static void copiaTreeMap(TreeMap<String,String> alfa){
    colores.putAll(alfa);
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



    public static void main(String[] args) {
        colores.put("C1","Rojo");
        colores.put("C2","Azul");
        colores.put("C3","Verde");
        colores.put("C4","Blanco");
        colores.put("C5","Negro");

imprimeMap();
        //main
    }


    //class
}
