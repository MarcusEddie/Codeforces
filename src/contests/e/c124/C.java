package contests.e.c124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] a = io.readLine().split(" ");
            String[] b = io.readLine().split(" ");
            int minL2 = Integer.MAX_VALUE;
            int minR2 = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                int tmp = Math.abs(Integer.valueOf(a[i]) - Integer.valueOf(b[0]));
                if (minL2 > tmp) {
                    minL2 = tmp;
                }
                tmp = Math.abs(Integer.valueOf(a[i]) - Integer.valueOf(b[len - 1]));
                if (minR2 > tmp) {
                    minR2 = tmp;
                }
            }

            int minL1 = Integer.MAX_VALUE;
            int minR1 = Integer.MAX_VALUE;
            for (int i = 0; i < b.length; i++) {
                int tmp = Math.abs(Integer.valueOf(b[i]) - Integer.valueOf(a[0]));
                if (minL1 > tmp) {
                    minL1 = tmp;
                }
                tmp = Math.abs(Integer.valueOf(b[i]) - Integer.valueOf(a[len - 1]));
                if (minR1 > tmp) {
                    minR1 = tmp;
                }
            }
            if (minL2 == minL1) {
                minL1 = 0;
            }
            if (minR1 == minR2) {
                minR1 = 0;
            }
            Long tmp = (long) (minL1 + minL2 + minR1 + minR2);
            rs.add(tmp);
        }
        for (Long long1 : rs) {
            System.out.println(long1);
        }
    }
}
