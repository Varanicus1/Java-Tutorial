public class Werkstatt4 {
    
    public Werkstatt4(){
        Main4.maxSpeed ++;
        System.out.println(Main4.maxSpeed);
    }

    public static void reparieren(){ //methode auf die jeder zugreifen kann aber immer das gleiche macht
        Main4.maxSpeed = 10;
    }
}
