public class T09OOP_Methoden {
    public static void main(String [] args){
         hallo();
         halloZu("Peter");

         int sum1= summe(4,5);
         double sum2 = summe(5.5,4.67);
    }



    //Erste Methode ohne rückgabe
    static void hallo(){

        System.out.println("hallo");
    }

    //Methode mit Parametern
    static void halloZu(String name){
        System.out.println("hallo"+ name);
    }

    //Methode mit Rückgabe
    static int summe(int a, int b) {
        return (a+b);
    }

    //gleicher methode namen wenn Parameter anders
    static double summe(double a,double b){
        return(a+b);
    }
}
