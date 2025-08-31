
import java.util.*;

public class SerejaandDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int serejascore = 0;
        int dimascore = 0;
        int flip = 0;
        int low = 0, high = n - 1;
        while (low <= high) {
            if (flip == 0) {
                if (arr[low] > arr[high]) {
                    serejascore += arr[low];
                    low++;
                } else {
                    serejascore += arr[high];
                    high--;
                }
                flip = 1;
            } else {
                if (arr[low] > arr[high]) {
                    dimascore += arr[low];
                    low++;
                } else {
                    dimascore += arr[high];
                    high--;
                }
                flip = 0;
            }
        }
        System.out.println(serejascore + " " + dimascore);
    }
}
