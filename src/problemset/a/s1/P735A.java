package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P735A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = io.readLine().split(" ");
        Integer n = Integer.valueOf(nk[0]);
        Integer k = Integer.valueOf(nk[1]);
        String input = io.readLine();
        int g = 0;
        int t = 0;
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'G') {
                g = i;
            }
            if (input.charAt(i) == 'T') {
                t = i;
            }
        }
        if (Math.abs(g - t) % k == 0) {
            int tmp = g;
            if (g > t) {
                g = t;
                t = tmp;
            }
            boolean flag = false;
            for(int i =g; i <= t;i = i + k) {
                if(input.charAt(i) == '#') {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }

}
