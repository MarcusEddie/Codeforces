package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P908A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        Integer rs = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == '1'
                    || input.charAt(i) == '3' || input.charAt(i) == '5' || input.charAt(i) == '7'
                    || input.charAt(i) == '9') {
                rs++;
            }
        }
        System.out.println(rs);
    }
}
