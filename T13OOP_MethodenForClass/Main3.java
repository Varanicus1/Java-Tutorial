public class Main3 {
    
    public static void main(String[] args){
        Auto3 porsche = new Auto3(350); 

        porsche.tune(porsche);
        System.out.println(porsche.getMaxSpeed());

        Auto3 ferrari = new Auto3(350);
        System.out.println(ferrari.getMaxSpeed());



 
        
 

    }

}
