public class Auto3 {

    private int maxSpeed;

    //Constructor
    public Auto3(int mS){
        this.setMaxSpeed(mS);
    }

    //Methode für Objects
    void tune(Auto3 a){
        a.setMaxSpeed(a.getMaxSpeed() +10);
    }

    //Getter/Setter
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    
}
