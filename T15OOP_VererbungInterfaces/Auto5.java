public class Auto5 extends Fahrzeug5{

    public Auto5(){
        reifen=4;
        farbe = "Blau";

        motorgeräusch();
        System.out.println(reifen +" "+ farbe);
    }

    @Override
    void motorgeräusch() {
        System.out.println("Auto: Brumm Brumm!");
        
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
