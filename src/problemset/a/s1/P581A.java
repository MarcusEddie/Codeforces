package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/581/A
 */
public class P581A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer red = Integer.valueOf(input[0]);
        Integer blue = Integer.valueOf(input[1]);
        Integer diff = 0;
        Integer rs2 = 0;
        if (red < blue) {
            diff = red;
        } else {
            diff = blue;
        }
        rs2 = Math.abs(red - blue) / 2;
        System.out.println(String.valueOf(diff) + " " +String.valueOf(rs2));
    }
}
