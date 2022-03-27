package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1091A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] ybr = io.readLine().split(" ");
        Integer y = Integer.valueOf(ybr[0]);
        Integer b = Integer.valueOf(ybr[1]);
        Integer r = Integer.valueOf(ybr[2]);
        Integer rs = 0;
        for(int i = 1; i <= y; i++) {
            if (!((i + 1) <= b && (i + 2) <= r)) {
                break;
            } else {
                rs = i;
            }
        }
        System.out.println((rs) * 3 + 3);
    }

}
