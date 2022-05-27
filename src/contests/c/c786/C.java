package contests.c.c786;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class C {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            String s = io.readLine();
            String t = io.readLine();
            Long tmp = 1L;
            if (t.length() == 1) {
                if (t.equals("a")) {
                    rs.add(1l);
                } else {
                    tmp += s.length();
                    for (int i = 2; i <= s.length(); i++) {
                        tmp += zuhe(i, s.length());
                    }
                    rs.add(tmp);
                }
            } else {
                if (t.contains("a")) {
                    rs.add(-1L);
                } else {
                    tmp += s.length();
                    for (int i = 2; i <= s.length(); i++) {
                        tmp += zuhe(i, s.length());
                    }
                    rs.add(tmp);
                }
            }
        }
        
        for (Long integer : rs) {
            System.out.println(integer);
        }
    }

    private static Long zuhe(int m, int n) {
//        Long sum1 = 1L;
        BigDecimal sum1 = new BigDecimal(1);
        for (int i = 1; i <= m; i++) {
            sum1 = sum1.multiply(new BigDecimal(i));
        }
//        Long sum2 = 1L;
        BigDecimal sum2 = new BigDecimal(1);
        for (int j = n; j >= n - m + 1; j--) {
            sum2 = sum2.multiply(new BigDecimal(j));
        }
        return sum2.divide(sum1).longValue();
    }
}
