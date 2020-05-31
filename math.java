
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
      int n;
      Scanner s = new Scanner(System.in);
      System.out.println(" ");
      n = s.nextInt();
      
      if(n%3 == 0){
        System.out.println("yes");
      }
      
      else
        System.out.println("not");
      
      s.close();
      
      
    }
}
