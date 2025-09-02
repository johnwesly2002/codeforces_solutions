import java.util.*;

public class SameDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (k - j == arr[k] - arr[j]) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
