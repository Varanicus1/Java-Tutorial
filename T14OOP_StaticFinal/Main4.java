public class Main4 {
    
    public static int maxSpeed = 10;//static bedeutet Variable kann man nur einmal im ganzen project benutzen
    public static final int reifen =4;//kann von überall aufgerufen werden aber nicht verändert werden

    public static void main(String[] args){
        
        //Zählt jedes mal maxspeed um eins hoch da alle die gleiche Variable nutzen
        /*Werkstatt w1 = new Werkstatt();
        Werkstatt w2 = new Werkstatt();
        Werkstatt w3 = new Werkstatt();*/

        //Ruft die klasse auf und erstellt kein object
         new Werkstatt4();
         //ruft eine methode der klasse auf wenn die methode statisch ist
         Werkstatt4.reparieren();
        

    }
}
