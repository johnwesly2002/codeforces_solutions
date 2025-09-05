import java.util.*;

public class Bit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String st = sc.next();
            if (st.contains("+"))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
