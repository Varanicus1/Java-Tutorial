public class Auto1{
    
    int maxSpeed;

    private int reifen = 4; // nur in der Klasse

    public String farbe; //von überall nutzbar

    protected double tank; //nur für die Klasse und unterklassen

    //Getter/Setter nur notwendig wenn nh Variable privat ist
    public int getReifen(){
        return reifen;
        }
    
    //void kein Rückgabe wert
    public void setReifen(int anzahlReifen){
        this.reifen = reifen; //this nimmt reifen aus der klasse und setzt es auf die semi variable
    }
    
}
