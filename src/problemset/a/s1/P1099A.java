package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1099A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] wh = io.readLine().split(" ");
        Integer w = Integer.valueOf(wh[0]);
        Integer h = Integer.valueOf(wh[1]);
        String[] s1 = io.readLine().split(" ");
        Integer u1 = Integer.valueOf(s1[0]);
        Integer d1 = Integer.valueOf(s1[1]);
        String[] s2 = io.readLine().split(" ");
        Integer u2 = Integer.valueOf(s2[0]);
        Integer d2 = Integer.valueOf(s2[1]);
        while (h >= 0) {
            w = w + h;
            if (d1.equals(h)) {
                w = w - u1;
                if (w.compareTo(0) < 0) {
                    w = 0;
                }
            }
            if (d2.equals(h)) {
                w = w - u2;
                if (w.compareTo(0) < 0) {
                    w = 0;
                }
            }
            h--;
        }
        System.out.println(w);
                
    }

}
