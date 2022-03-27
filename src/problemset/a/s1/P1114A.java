package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1114A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] xyz = io.readLine().split(" ");
        Integer x = Integer.valueOf(xyz[0]);
        Integer y = Integer.valueOf(xyz[1]);
        Integer z = Integer.valueOf(xyz[2]);
        String[] abc = io.readLine().split(" ");
        Integer a = Integer.valueOf(abc[0]);
        Integer b = Integer.valueOf(abc[1]);
        Integer c = Integer.valueOf(abc[2]);
        boolean flag = true;
        if (a.compareTo(x) < 0) {
            flag = false;
        } else {
            a = a - x;
            if (a + b - y < 0) {
                flag = false;
            } else {
                if (a.compareTo(y) > 0) {
                    a = a - y;
                } else {
                    b = b - (y -a);
                    a = 0;
                }
                if(z - (a + b + c) > 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        
    }

}
