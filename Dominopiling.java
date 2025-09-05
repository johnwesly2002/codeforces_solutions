
import java.util.*;

public class Dominopiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int area = m * n;
        if (area % 2 == 0) {
            System.out.println(area / 2);
            return;
        }
        area = area - 1;
        System.out.println(area / 2);

    }
}
