package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P746A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.valueOf(io.readLine());
        Integer b = Integer.valueOf(io.readLine());
        Integer c = Integer.valueOf(io.readLine());
        int i = 0;
        for(i = 1; i <= a; i++) {
            if (!(i * 2<= b && i * 4 <= c )) {
                break;
            }
        }
        System.out.println(7 * i - 7);
    }

}
