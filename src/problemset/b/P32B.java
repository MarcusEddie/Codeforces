package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * https://codeforces.com/problemset/problem/32/B
 */
public class P32B {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String rs = "";
        int i = 0;
        while (true) {
            if (input.indexOf("--") == 0) {
                rs = rs + "2";
                input = input.substring(2);
            } else if (input.indexOf("-.") == 0) {
                rs = rs + "1";
                input = input.substring(2);
            } else if (input.indexOf(".") == 0) {
                rs = rs +"0";
                input = input.substring(1);
            }
            if (input.length()  == 0) {
                break;
            }
        }
        System.out.println(rs);
    }
}
