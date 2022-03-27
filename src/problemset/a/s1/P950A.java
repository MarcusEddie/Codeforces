package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P950A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] input = io.readLine().split(" ");
        Integer l = Integer.valueOf(input[0]);
        Integer r = Integer.valueOf(input[1]);
        Integer a = Integer.valueOf(input[2]);
        Integer rs = 0;
        if((l.equals(0) && a.equals(0)) || (r.equals(0) && a.equals(0)) || (r.equals(0) && r.equals(0) && a.equals(0))) {
            rs = 0;
        } else if((l.equals(0) && r.equals(0) && !a.equals(0))) {
            rs = a;
            if (a % 2 == 1) {
                rs--;
            }
        } else {
            if (l < r) {
                rs = 2 * l;
            } else {
                rs = 2 * r;
            }
            if (a.compareTo(Math.abs(l - r)) >=0) {
                rs = rs + 2 * Math.abs(l -r);
                a = a - Math.abs(l - r);
            } else {
                rs = rs + 2 * a;
                a = 0;
            }
            if (a.compareTo(0) > 0) {
                rs = rs + a;
                if (a %2 == 1) {
                    rs--;
                }
            }
        }
        System.out.println(rs);
    }
}
//89 44 77