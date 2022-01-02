public class Auto2 {

    private int reifen;
    private String farbe;
    private double tank;
    

    //Constructor
    public Auto2(){//Ohne Parameter
        this.setReifen(4);
        this.setFarbe("Blau");
        this.setTank(55.45);
    }

    public Auto2(int reifen){//Mit einem Parameter
        this.setReifen(reifen);
        this.setFarbe("Blau");
        this.setTank(55.45);
    }

    public Auto2(int reifen,String farbe,double tank){ //Mit mehreren Parametern
        this.setReifen(reifen);
        this.setFarbe(farbe);
        this.setTank(tank);
    }

    //Getter/Setter
    public int getReifen(){
        return reifen;
    }

    public void setReifen(int reifen){
        this.reifen=reifen;
    }

    public String getFarbe(){
        return farbe;
    }

    public void setFarbe(String farbe){
        this.farbe=farbe;
    }

    public double getTank(){
        return tank;
    }

    public void setTank(double tank){
        this.tank=tank;
    }

    
}
