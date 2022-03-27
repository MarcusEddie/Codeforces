package contests.c.c776;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            String[] lra = io.readLine().split(" ");
            Long l = Long.valueOf(lra[0]);
            Long r = Long.valueOf(lra[1]);
            Long a = Long.valueOf(lra[2]);
            Long tmp = 0L;

            Long tm = 0L;
            if (r % a == 0) {
                tm = r / a;
            }
            tmp = r / a;
            if (r % a == 0) {
                tmp--;
            }
            if (r % a == 0) {
                r--;
            }
            tmp = tmp + r % a;
            if (tm.compareTo(tmp) >0) {
                rs.add(tm);
            } else {
                rs.add(tmp);
                
            }
        }
        for (Long long1 : rs) {
            System.out.println(long1);
        }
    }
}
