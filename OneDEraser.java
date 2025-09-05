import java.util.*;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String st = sc.next();
            int cnt = 0;
            char[] chs = st.toCharArray();
            for (int j = 0; j <= n - k; j += k) {
                int flag = 0;
                for (int l = j; l < j + k; l++) {
                    if (chs[l] == 'B') {
                        chs[l] = 'W';
                        flag = 1;
                    }
                }
                if (flag == 1)
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}
