package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1152A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        String[] a = io.readLine().split(" ");
        String[] b = io.readLine().split(" ");
        Integer rs = 0;
        int aOdd = 0;
        int aEven = 0;
        int bOdd = 0;
        int bEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (Integer.valueOf(a[i]) % 2 == 0) {
                aEven++;
            } else {
                aOdd++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (Integer.valueOf(b[i]) % 2 == 0) {
                bEven++;
            } else {
                bOdd++;
            }
        }
        
        if (bOdd > aEven) {
            rs = aEven;
        } else {
            rs = bOdd;
        }
        if (bEven > aOdd) {
            rs = rs + aOdd;
        } else {
            rs = rs + bEven;
        }
        System.out.println(rs);
    }
}
