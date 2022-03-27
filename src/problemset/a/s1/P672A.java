package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P672A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String str = "";
        for (int i = 1; i < 1000; i++) {
            str = str + String.valueOf(i);
        }
        if (n.compareTo(9) <= 0) {
            System.out.println(n);
        } else if (n.compareTo(10) >= 0 && n.compareTo(189) <= 0) {
            n = n - 9;
            boolean flag = true;
            if (n % 2 == 1) {
                n++;
                flag = false;
            }
            n = n / 2;
            int tmp = 9 + n;
            if (flag) {
                System.out.println(tmp % 10);
            } else {
                System.out.println(tmp / 10);
            }
        } else {
            n = n - 189;
            int remainer = 0;
            if (n % 3 != 0) {
                n = n +3;
                remainer = n % 3;
            }
            n = n / 3;
            int tmp = 99 + n;
            if (remainer == 0) {
                System.out.println(tmp % 10);
            } else if (remainer == 1) {
                System.out.println(tmp / 100);
            } else if (remainer == 2) {
                tmp = tmp / 10;
                System.out.println(tmp % 10);
            }
        }
    }
}
