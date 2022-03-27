package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P919A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        Integer n = Integer.valueOf(nm[0]);
        Double m = Double.valueOf(nm[1]);
        Double rs = Double.MAX_VALUE;
        while (n > 0) {
            n--;
            String[] ab = io.readLine().split(" ");
            Double a = Double.valueOf(ab[0]);
            Double b = Double.valueOf(ab[1]);
            if (rs.compareTo(a / b) > 0) {
                rs = (double)(a / b);
            }
        }
        System.out.println(m * rs);
    }
}
