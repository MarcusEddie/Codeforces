package contests.e.c124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Double> rs = new ArrayList<Double>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            Double tmp = compute(n);
            rs.add(tmp);
        }
        for (double integer : rs) {
            System.out.println(String.format("%.0f", integer));
        }
    }
    private static double compute(Integer n) {
        double rs = 0;
        if (n.compareTo(1) == 0) {
            rs = 1;
        } else {
            rs = Math.pow(2, n) - 1;
        }
        return rs;
    }
}
