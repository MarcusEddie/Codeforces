package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P898A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        if (n % 10 == 5) {
            n = n - 5;
        } else if (n % 10 < 5) {
            n = n - n % 10;
        } else if (n %10  > 5) {
            n = n + 10 - n % 10;
        }
        System.out.println(n);
    }
}
