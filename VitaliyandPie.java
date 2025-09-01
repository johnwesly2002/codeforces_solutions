import java.util.*;

public class VitaliyandPie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doors = sc.nextInt();
        String s = sc.next();
        int n = s.length();
        Map<Character, Integer> st = new HashMap<>();
        int keytobuy = 0;
        for (int i = 1; i < n; i += 2) {

            char door = Character.toLowerCase(s.charAt(i));
            char key = s.charAt(i - 1);
            st.put(key, st.getOrDefault(key, 0) + 1);

            if (st.getOrDefault(door, 0) > 0) {
                st.put(door, st.get(door) - 1);
            } else {
                keytobuy++;
            }
        }
        System.out.println(keytobuy);
    }
}
