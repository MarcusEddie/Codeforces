package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P401A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = io.readLine().split(" ");
        Integer n = Integer.valueOf(nx[0]);
        Integer x = Integer.valueOf(nx[1]);
        String[] input = io.readLine().split(" ");
        Integer sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + Integer.valueOf(input[i]);
        }
        if (sum == 0) {
            System.out.println(0);
        } else {
            sum = Math.abs(sum);
            if (sum % x == 0) {
                System.out.println(sum / x);
            } else {
                System.out.println(sum / x + 1);
            }
        }
    }

}
