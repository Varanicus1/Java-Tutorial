import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main10 {

    public Main10(){
    
    
        //Ordner und dateien erstellen
        File folder1 = new File("src/ordner");
        File file1 =new File("src/ordner/text.txt");

        if(folder1.exists()){
            System.out.println("Ordner existiert!");
        }else{
            folder1.mkdirs();
            System.out.println("Ordner wurde neu erstellt");
        }

        if(file1.exists()){
            System.out.println("Datei existiert");
        }else{
            try {
                file1.createNewFile();
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        }

        //Dateien auslesen
        try {

            Scanner sc= new Scanner(file1);//scannt file1
        
            while(sc.hasNext()){ //liest jedes wort nacheinander ein
                System.out.print(sc.next() + " ");//schreibt jedes wort in die konsole
            }

            sc.close();//danach immer schließen
        } catch (FileNotFoundException e) {
           System.out.println("datei konnte nicht gefunden werden");
            e.printStackTrace();
        }

        //In datei schreiben
        try {
            OutputStream stream = new FileOutputStream(file1);

            String textInhalt ="Hallo welt\r\nDas ist ein Text"; //\r\n ist ein zeilenumbruch

            try {
                stream.write(textInhalt.getBytes());
                stream.close();
            } catch (IOException e) {
                
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        }
            
        
    }

    public static void main(String[] args){
        new Main10();
    }
    
}
