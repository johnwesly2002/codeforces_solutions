import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int advancers = arr[k - 1];
        int i = 0;
        int cnt = 0;
        while (i < n) {
            if (arr[i] >= advancers && arr[i] > 0) {
                cnt++;
            } else {
                break;
            }
            i++;
        }
        System.out.println(cnt);
    }
}
