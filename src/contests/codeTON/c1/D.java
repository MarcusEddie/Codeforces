package contests.codeTON.c1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class D {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            BigDecimal n = new BigDecimal(io.readLine());
            int i = 2;
            BigDecimal n1 = null;
            BigDecimal divisor = null;
            if (n.remainder(new BigDecimal(2)).intValue() == 0) {
                i = 3;
                divisor = new BigDecimal(i);
            } else {
                divisor = new BigDecimal(i - 1);
            }
            n1 = n.subtract(divisor);
            while (true) {
                if (n1.intValue() < 0) {
                    rs.add(-1);
                    break;
                }
                BigDecimal remainder = n1.remainder(new BigDecimal(i));
                if (remainder.intValue() == 0) {
                    rs.add(i);
                    break;
                } else {
                    i++;
                    divisor = new BigDecimal(i - 1);
                    n1 = n1.subtract(divisor);
                }
                if (n.compareTo(new BigDecimal(2 * i)) <= 0) {
                    rs.add(-1);
                    break;
                }
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
