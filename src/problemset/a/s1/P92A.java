package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P92A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        Integer n = Integer.valueOf(nm[0]);
        Integer m = Integer.valueOf(nm[1]);
        Integer tmp = (1 + n) * n / 2;
        m = m % tmp;
        if (m == 0) {
            System.out.println(0);
        } else {
            for(int i = 1; i <= n; i++) {
                if (m < i) {
                    break;
                }
                m = m - i;
            }
            System.out.println(m);
        }
    }

}
