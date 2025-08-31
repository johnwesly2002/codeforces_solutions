import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            String s = sc.next();
            int cnt = 0;
            int n = s.length();
            if (n <= 10)
                System.out.println(s);
            else {
                String res = s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(n - 1);
                System.out.println(res);
            }
        }
    }
}