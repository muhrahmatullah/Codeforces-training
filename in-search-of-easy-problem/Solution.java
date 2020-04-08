import java.util.*;

public class Solution {
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int sum = 0;
      for(int i = 0; i < n; i++) {
         sum+=scanner.nextInt();
      }

      if(sum == 0) {
         System.out.print("EASY");
      } else {
         System.out.print("HARD");
      }

   }

}
