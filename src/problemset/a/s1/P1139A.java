package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1139A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String input = io.readLine();
        Integer sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0' || input.charAt(i) == '2' || input.charAt(i) == '4'
                    || input.charAt(i) == '6' || input.charAt(i) == '8') {
                sum = sum + i + 1;
            }

        }
        System.out.println(sum);
    }
}
