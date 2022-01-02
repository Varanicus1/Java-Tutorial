import java.util.HashMap;
import java.util.HashSet;

public class Main9 {

    public Main9(){
    
        HashMap<String, Integer> punkte = new HashMap<String, Integer>(); //wie arraylist nur gibt einen schlüssel
        punkte.put("Hans",100);
        punkte.put("Peter",54);
        punkte.put("Dieter",73);

        System.out.println(punkte);
        System.out.println(punkte.get("Hans"));

        HashSet<String> buchstaben = new HashSet<>();
        buchstaben.add("A");
        buchstaben.add("B");
        buchstaben.add("C");    
    
        System.out.println(buchstaben);
        System.out.println(buchstaben.size());
    }

    public static void main(String[] args){
        new Main9();
    }
    
}
