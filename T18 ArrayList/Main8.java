import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main8 {

    public Main8(){
        ArrayList<String> farben = new ArrayList<String>(3); //3 ist die länge des Arrays
        farben.add("Rot");
        farben.add("Grün");
        farben.add("Blau");

        System.out.println(farben);
       // System.out.println(farben.contains("Blau")); //contains überprüft ob es einen spezielen String noch gibt
       // System.out.println(farben.get(0));//was an welcher stelle steht
       // System.out.println(farben.size());//Wie lang das array ist
       // farben.remove("Blau"); // entfernt blau wenn man die stelle nimmt wo blau steht also bei uns 2 würde es auch entfernt werden
       // farben.clear();//löscht alles aus der liste
        Collections.sort(farben);//sortiert das array von klein nach groß oder von a bis z
        System.out.println(farben);

        LinkedList<Integer> zahlen = new LinkedList<Integer>();
        zahlen.add(2);
        zahlen.add(100);
        zahlen.add(42);

        System.out.println(zahlen);
        for( int t:zahlen){
            System.out.println(t);
        }

        zahlen.add(1,50); // an der stelle 1 wird die zahl 50 hinzugefügt geht nur bei linkedlist
        System.out.println(zahlen.indexOf(50)); // schaut an welcher stelle 50 steht
        Collections.sort(zahlen);

    }

    public static void main(String[] args){
        new Main8();
    }
    
}
