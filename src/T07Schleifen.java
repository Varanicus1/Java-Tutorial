public class T07Schleifen {
    public static void main(String [] args){


        int x = 5;

        //while schleife
        while(x > 0){
            System.out.println(x);
            x--;
        }

        //einmal ausführen und dann erst schleife
        do{
            System.out.println(x);
            x++;
        }while(x<0);

        //while wenn bedingung immer zutreffen soll
        while(true){
            System.out.println(x);
            x++;
            if(x ==6){ //Abruchbedingung der Schleife
                break;
            }
        }

        //for Schleife
        for(int i =1; i<5; x++){
            System.out.println(i);
        }



    }
}
