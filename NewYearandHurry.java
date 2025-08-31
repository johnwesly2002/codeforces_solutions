import java.io.*;
import java.util.*;

class NewYearandHurry {
    public static int findTime(int n, int k) {
        int low = 1;
        int high = n;
        int maxi = 240;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) >> 1;
            int res = findtimetocode(mid);
            if ((res + k) <= maxi) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int findtimetocode(int val) {
        int sum = 0;
        for (int i = 1; i <= val; i++) {
            sum += i * 5;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(findTime(n, k));
    }
}