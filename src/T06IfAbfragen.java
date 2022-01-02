public class T06IfAbfragen {
    public static void main(String [] args){
    int x = 6;

    if(x < 8){

        System.out.println("x ist kleiner als 6");
    } 

    if (x != 7){
        System.out.println("x ist nicht 7");
    }

    //Verschachtelte If abfragen
    if(x <=6){
        if(x==3){
            System.out.println("x ist kleiner gleich 6 und genau 3");
        }
    }

    //if else
    if(x==3){
        System.out.println("x ist gleich 3");
    }else{
        System.out.println("x ist nicht 3");
    }

    //if else if
    if(x==6){
        System.out.println("x ist gleich 6");//wenn der teil gleich war wird der rest übersprungen
        x++; //bei ifs nacheinander würde beide einen output geben da beide war wären
    }else if(x==7){
        System.out.println("x ist gleich 7");
    }

    //logische Operatoren
    if (x >=3 && x<=6){
        System.out.println("x liegt zwischen 3 und 6");
    }
    if (x >=3 || x<=6){
        System.out.println("x liegt zwischen 3 oder 6");
    }

    switch(x){
         case 1:x++;
            break;//wenn case 1 erfüllt bricht die switch ab da case2 auch zutreffen würde
         case 2://Code;
            break;
         case 9://Code
            break;

        default:System.out.println("x ist weder 1,2,9");//wenn nicht zutrifft von den casen wie else bei if
  
    }



  }
}
