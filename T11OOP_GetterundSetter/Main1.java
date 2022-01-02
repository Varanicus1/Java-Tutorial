public class Main1 {
    
    public static void main(String[] args){
        Auto1 porsche = new Auto1(); 

        int x = porsche.getReifen(); // nur ein abbild der variable
        System.out.println(x);

        porsche.setReifen(5); //aber nur für porsche und nicht allgemein reifen verändert
        System.out.println(porsche.getReifen());

        Auto1 ferrari = new Auto1();
        System.out.println(ferrari.getReifen());
        
 

    }

}
