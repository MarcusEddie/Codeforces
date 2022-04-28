package contests.c.c783;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] nm = io.readLine().split(" ");
            Integer n = Integer.valueOf(nm[0]);
            Integer m = Integer.valueOf(nm[1]);
            String[] input = io.readLine().split(" ");
            if (n * 2 > m) {
                rs.add("NO");
                continue;
            }
            int[] slot = new int[input.length];
            for (int i = 0; i < slot.length; i++) {
                slot[i] = Integer.valueOf(input[i]);
            }
            if (slot.length == 1) {
                if (slot[0] + 2 <= m) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
                continue;
            }
            Arrays.sort(slot);
            int total = slot[slot.length - 1] * 2 + 1;
//            System.out.println(Arrays.toString(slot));
            for (int i = slot.length - 2; i >= 0; i--) {
                if (i == 0) {
                    total++;
                } else {
                    total = total + 1 + slot[i];
                }
            }
//            System.out.println(total);
            if (total <= m) {
                rs.add("YES");
            } else {
                rs.add("NO");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
