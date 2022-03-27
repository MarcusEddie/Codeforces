package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/255/A
 * @author ey
 *
 */
public class P255A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        Integer chest = 0;
        Integer biceps = 0;
        Integer back = 0;
        int idx = 1;
        for (int i = 0; i < input.length; i++) {
            if (idx % 3 == 1) {
                chest = chest + Integer.valueOf(input[i]);
                idx++;
            } else if (idx %3 == 2) {
                biceps = biceps + Integer.valueOf(input[i]);
                idx++;
            } else {
                back = back + Integer.valueOf(input[i]);
                idx++;
            }
        }
        if (chest.compareTo(biceps) > 0 && chest.compareTo(back) > 0) {
            System.out.println("chest");
        } else if (biceps.compareTo(chest) > 0 && biceps.compareTo(back) > 0) {
            System.out.println("biceps");
        } else if (back.compareTo(biceps) > 0 && back.compareTo(chest) > 0) {
            System.out.println("back");
        }
    }

}
