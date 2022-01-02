public class Main {
    
    public static void main(String[] args){
        Auto porsche = new Auto(); //Object aus der Klasse auto erstellt
        porsche.hupe(); //Methode aus der class Auto
        
        porsche.farbe="Schwarz";
        porsche.maxSpeed=320;
        porsche.tank = 65.5;

        Auto ferrari = new Auto();
        ferrari.farbe="Rot";
        ferrari.hupe();

    }

}
