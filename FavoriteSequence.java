import java.util.*;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[] ans = new int[n];
            int left = 0;
            int right = n - 1;
            int flag = 0;
            int j = 0;
            while (left <= right) {
                if (flag == 0) {
                    ans[j] = arr[left];
                    flag = 1;
                    left++;
                } else {
                    ans[j] = arr[right];
                    flag = 0;
                    right--;
                }
                j++;
            }

            for (int k = 0; k < n; k++) {
                System.out.print(ans[k] + " ");
            }

        }
    }
}
