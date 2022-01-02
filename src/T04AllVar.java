


public class T04AllVar {
    public static void main(String[] args) throws Exception {
        

    //Operatoren / Variablen 02/03
    int summe1 = 10;
    int summe2 = 5;
    int summe3 = 100;
    int summe4 = 10*5-5+2;
    summe3 = summe3 -summe2;
    summe3 -=summe1;
    String abc = ("Ergebnis:"+ (summe1-summe2)); //Summe zu string ergenzen
    System.out.println(abc);
    

    //Casten 04
    double größe = 1.75;
    größe= (int)größe; //nimmt ein intecher an ist aber keiner
    System.out.println(größe);

    int alter = 42;
    double alterGenau = (double)alter; //nimmt ein double an und wird zu double
    System.out.println(alterGenau);

    //Math klasse 04
    int zahl = -2;
    zahl = Math.abs(zahl);
    System.out.println(zahl);

    double random = (Math.random());  //werte zwischen 0 und 1
    double random1 = (Math.random()*10); //werte zwischen 0 und 9 
    double random2 = (Math.random()*10)+1; //werte zwischen 1 und 10
    int random3 = (int)(Math.random()*4)+1; //Math class lässt sich casten
    System.out.println(random);

 


}

}
