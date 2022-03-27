package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1216A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String input = io.readLine();
        len = len / 2;
        int rs = 0;
        StringBuffer str = new StringBuffer();
        if (input.indexOf("a") < 0 || input.indexOf("b") < 0) {
            rs = len;
            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    str.append("a");
                } else {
                    str.append("b");
                }
            }
            System.out.println(rs);
            System.out.println(str.toString());
        } else {
            for (int i = 0; i < input.length() - 1; i = i + 2) {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    rs++;
                    str.append("ab");
                } else {
                    str.append(String.valueOf(input.charAt(i))).append(String.valueOf(input.charAt(i + 1)));
                }
            }
            System.out.println(rs);
            System.out.println(str.toString());
        }
    }
}
