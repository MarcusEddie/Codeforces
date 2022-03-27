package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/263/A
 * @author ey
 *
 */
public class P263A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] input = new String[5][5];
        Integer row = 0;
        Integer col = 0;
        for (int i = 0; i < input.length; i++) {
            String tmp = br.readLine();
            if (tmp.contains("1")) {
                row = i +1;
            }
            input[i] = tmp.split(" ");
        }
        for (int i = 0; i < input[row - 1].length; i++) {
            if (input[row - 1][i].equals("1")) {
                col = i + 1;
                break;
            }
        }
        System.out.println(Math.abs(3 - row) + Math.abs(col - 3));
    }
}
