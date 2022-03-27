package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1085A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        int sign = 1;
        if (input.length() % 2 == 1) {
            sign = -1;
        }
        String rs = "";
        int len = input.length();
        for(int i = 0; i < len; i++) {
            if (sign > 0) {
                rs = String.valueOf(input.charAt(input.length() - 1)) + rs;
                input = input.substring(0, input.length() - 1);
                sign = -sign;
            } else {
                rs = String.valueOf(input.charAt(0)) + rs;
                input = input.substring(1);
                sign = -sign;
            }
        }
        System.out.println(rs);
    }

}
