package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P00000000002A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        List<Double> pre = new ArrayList<Double>();
        Double i = 16d;
        while (i > 0d) {
            pre.add(fact(i));
            i--;
        }
        i = 36d;
        while (i > 0l) {
            pre.add(Math.pow(2, i));
            i--;
        }
        Collections.sort(pre);
        double[] arr = new double[pre.size()];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = pre.get(j);
        }
        
        while (cnt > 0) {
            cnt--;
            Double n = Double.valueOf(io.readLine());
            Long tmp = 0L;
            for(int j = arr.length - 1; j >= 0; j--) {
                if (n.compareTo(arr[j]) >=0) {
                    tmp++;
                    n = n - arr[j];
                }
                if (n.equals(0)) {
                    break;
                }
            }
            rs.add(tmp);
        }
        for (Long d : rs) {
            System.out.println(d);
        }
    }
    
    private static Double fact(Double n) {
        if (n.equals(0L)) {
            return 1d;
        }
        Double product = 1d;
        while (n > 0) {
            product = product * n;
            n--;
        }
        return product;
    }
}
