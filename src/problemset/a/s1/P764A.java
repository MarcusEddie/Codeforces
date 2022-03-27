package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P764A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nmz = io.readLine().split(" ");
        Integer n = Integer.valueOf(nmz[0]);
        Integer m = Integer.valueOf(nmz[1]);
        Integer z = Integer.valueOf(nmz[2]);
        int a = z / n;
        int b = z / m;
        int rs = 0;
        if (a < b) {
            for(int i = 1; i<= a; i++) {
                if (i * n % m == 0) {
                   rs++; 
                }
            }
        } else {
            for(int i = 1; i<= b; i++) {
                if (i * m % n == 0) {
                   rs++; 
                }
            }
        }
        System.out.println(rs);
    }

}
