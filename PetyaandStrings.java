import java.util.*;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int n = str1.length();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < n; i++) {
            int a = str1.charAt(i) - 'a';
            int b = str2.charAt(i) - 'a';
            if (a > b) {
                System.out.println(1);
                return;
            } else if (a < b) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(0);
    }
}
