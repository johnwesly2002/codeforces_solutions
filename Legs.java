import java.io.*;
import java.util.*;

public class Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int cow = n / 4;
            int chicken = n / 2;
            int low = 0;
            int high = cow + chicken;
            int ans = 0;
            while (low <= high) {
                int mid = (low + high) >> 1;
                if (((cow * 4) + (mid * 2)) <= n) {
                    ans = cow + mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(ans);

        }
    }

}
