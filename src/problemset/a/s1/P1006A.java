package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/1006/A
 */
public class P1006A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        Integer max = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (max.compareTo(Integer.valueOf(input[i])) <=0) {
//                max = Integer.valueOf(input[i]);
//            }
//        }
        String rs = "";
        for (int i = 0; i < input.length; i++) {
            if (Integer.valueOf(input[i]) % 2 == 0) {
                rs = rs + " " + (Integer.valueOf(input[i]) - 1);
            } else {
                 rs = rs + " " + input[i];
            }
        }
        System.out.println(rs.substring(1));

    }

}
