import java.util.*;

public class CanISquare {
    public static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int nbuckets = sc.nextInt();
            long sum = 0;
            for (int el = 0; el < nbuckets; el++) {
                sum += sc.nextInt() % mod;
            }
            double square = Math.sqrt(sum);
            if (square == Math.floor(square)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
