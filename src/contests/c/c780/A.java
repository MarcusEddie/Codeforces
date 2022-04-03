package contests.c.c780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] ab = io.readLine().split(" ");
            Integer a = Integer.valueOf(ab[0]);
            Integer b = Integer.valueOf(ab[1]);
            if (a.equals(0) && !b.equals(0)) {
                rs.add(1);
            } else if (a.equals(0) && b.equals(0)) {
                rs.add(1);
            } else if (!a.equals(0) && b.equals(0)) {
                rs.add(a + 1);
            } else {
                rs.add(a + 1 + (b << 1));
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
