import java.util.*;

class Journey {

    public static long findN(int day, long a, long b, long c) {
        int portion = day / 3;
        long sum = ((a + b + c) * portion);
        int rem = day % 3;
        if (rem >= 1)
            sum += a;
        if (rem >= 2)
            sum += b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            long mini = Math.min(a, Math.min(b, c));
            int low = 1;
            int high = (int) Math.ceil((double) n / (double) mini);
            long ans = high;
            while (low <= high) {
                int mid = (low + high) >> 1;
                long res = findN(mid, a, b, c);
                if (res < n) {
                    low = mid + 1;
                } else {
                    ans = mid;
                    high = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }
}