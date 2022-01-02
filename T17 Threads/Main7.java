public class Main7 {

    int count = 0;
    

public static void main(String [] args){
    Thread t = new Thread(new MeinThread7());
    t.start();
}
}
