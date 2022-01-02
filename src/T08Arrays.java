public class T08Arrays {
    public static void main(String [] args){
    
        //Eindimensionale Arrays
        int[] array;//intecher array undefined groß
        int[] array2 = new int[5]; //array hat 5 felder beginnt bei 0
        int[] array3 = new int[10];

        //felder zuweisung
        array2[0] = 10; 
        array2[2] = 42;
        array2[4] = 100;

        //schnellere zuweisung anzahl der namen ist gleich länge des arrays
        String[] namen = {"Hans","Peter","David"};
        System.out.println(namen[2]);
        System.out.println(namen.length);//länge des arrays ausgeben

        //zuweisung mit einer for schleife
        for(int i = 0;i<array3.length; i++){
            array3[i] = i*25;
            System.out.println(array3[i]);
        }

        for(int t:array3){//Vereinfachte for Schleife an jeder stelle wo das array ist wird der Variable t zugewiesen

            System.out.println(t);//gleiches ergebnis wie oben
        }

        //ZweiDimensionale Arrays
        int[][] array2d = {{1,2,3},{4,5,6}};
        /*[0] x also reihe*/  /*[1] y also spalte oder slot*/ ;
        int x= array2d[0][1];
        System.out.println(x);

    }
}
