import java.util.Scanner;

public class T05Usereingaben {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("Alter eingeben:");
       int alter = sc.nextInt();

       System.out.println("Name eingeben: \n\r" );
       String name = sc.next();

       System.out.println("Größe eingeben:");
       double größe = sc.nextDouble();
    }
}
