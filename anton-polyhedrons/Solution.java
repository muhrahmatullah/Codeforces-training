import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int faces = 0;

        for(int i = 0; i <= n; i++) {
            String temp = scanner.nextLine();
            switch(temp) {
                case "Icosahedron" : faces+=20; break;
                case "Cube" : faces+=6; break;
                case "Tetrahedron" : faces+=4; break;
                case "Octahedron" : faces+=8; break;
                case "Dodecahedron" : faces+=12; break;
                default: faces+=0; break;
            }
        }

        System.out.print(faces);
        scanner.close();
    }
}