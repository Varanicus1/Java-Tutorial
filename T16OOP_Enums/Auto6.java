public class Auto6 extends Fahrzeug6{

    public Auto6(){
     
        Fahrzeug_Enum6 fe= Fahrzeug_Enum6.NORMALAUTO;
        fe= fe.RENNWAGEN;

        switch(fe){
            case SCHROTTKARRE: System.out.println("Unser auto ist eine schrottkarre");
            break;
            case NORMALAUTO:  System.out.println("Unser auto ist ein Normalauto");
            break;
            case SPORTWAGEN: System.out.println("Unser auto ist ein Sportwagen");
            break;
            case RENNWAGEN: System.out.println("Unser auto ist ein Rennwagen");
            break;
        }
    }

    
}
