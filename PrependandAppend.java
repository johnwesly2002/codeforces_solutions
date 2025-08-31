import java.util.*;

public class PrependandAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int low = 0;
            int high = n - 1;
            while (low < high) {
                if (s.charAt(low) == s.charAt(high))
                    break;
                low++;
                high--;
            }
            System.out.println(high - low + 1);
        }
    }
}
