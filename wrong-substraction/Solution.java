import java.util.*;

public class Solution {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int k = scanner.nextInt();
      for(int i = 0; i < k; i++) {
          if(num % 10 == 0) {
              num /= 10;
          } else {
              num--;
          }
      }
      System.out.print(num);
    }
}
