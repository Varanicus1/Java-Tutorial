public class MeinThread7 implements Runnable{

    Main7 m;
    
    public MeinThread7(){

        m=new Main7();
    }

    @Override public void run(){

        while(true){

            m.count++;

            System.out.println(m.count);

            try{Thread.sleep(500);}
            catch( InterruptedException e){
                e.printStackTrace();
                System.out.println("thread wurde unerwartet beendet");
            }
            
        
     }

    }
}
