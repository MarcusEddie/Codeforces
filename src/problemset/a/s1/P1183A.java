package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/1183/A
 * @author ey
 *
 */
public class P1183A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.valueOf(io.readLine());
        while (true) {
            Integer sum = 0;
            Integer input2 = input;
            while(input2 > 0) {
                sum = sum + input2 % 10;
                input2 = input2 / 10;
            }
            if (sum % 4 == 0) {
                break;
            } else if(input % 10 != 9) {
                input = input + (4 - sum % 4);
            } else {
                input = input + 1;
                sum = 0;
                input2 = input;
                while(input2 > 0) {
                    sum = sum + input2 % 10;
                    input2 = input2 / 10;
                }
                if (sum % 4 == 0) {
                    break;
                } else {
                    input = input + (4 - sum % 4);
                }
            }
        }
        System.out.println(input);
    }
}
