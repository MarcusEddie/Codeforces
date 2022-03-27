package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P615A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm= io.readLine().split(" ");
        Integer n = Integer.valueOf(nm[0]);
        Integer m = Integer.valueOf(nm[1]);
        int[] bulbs = new int[m + 1];
        while (n > 0) {
            n--;
            String[] input = io.readLine().split(" ");
            for (int i = 1; i < input.length; i++) {
                bulbs[Integer.valueOf(input[i])] = 1;
            }
        }
        boolean flag = true;
        for (int i = 1; i < bulbs.length; i++) {
            if (bulbs[i] != 1) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
