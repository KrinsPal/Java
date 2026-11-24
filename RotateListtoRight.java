import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        int n = list.size();
        if (n > 0) {
            k = k % n;
            Collections.reverse(list);
            Collections.reverse(list.subList(0, k));
            Collections.reverse(list.subList(k, n));
        }
        System.out.println(list);
    }
}