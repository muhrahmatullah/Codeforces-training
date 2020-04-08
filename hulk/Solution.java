import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        String a = "I hate ";
        String b = "I love ";

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sb.append(b);
            } else {
                sb.append(a);
            }
            if(i < n) {
                sb.append("that ");    
            }
        }

        sb.append("it");

        System.out.print(sb.toString());
        
        scanner.close();
    }
}