public class Motorrad5 extends Fahrzeug5{

    public Motorrad5(){
        reifen=2;
        farbe = "Schwarz";

        motorgeräusch();
        System.out.println(reifen +" "+ farbe);
    }

    @Override
    void motorgeräusch() {
       System.out.println("Motorrad: Brrrr!");
        
    }

    @Override
    public void fahr() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void geräusch() {
        // TODO Auto-generated method stub
        
    }
    
}
