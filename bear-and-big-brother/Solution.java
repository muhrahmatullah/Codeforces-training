import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int limak = scanner.nextInt();
        int bob = scanner.nextInt();

        int year = 0;
        do {
            limak*=3;
            bob*=2;
            year++;
        }while(limak <= bob);

        System.out.print(year);

    }
}