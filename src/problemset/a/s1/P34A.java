package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        int[] diff = new int[len];
        for (int i = 0; i < input.length; i++) {
            if (i + 1>= input.length) {
                diff[i] = Math.abs(Integer.valueOf(input[i]) - Integer.valueOf(input[0]));
            } else {
                diff[i] = Math.abs(Integer.valueOf(input[i]) - Integer.valueOf(input[i + 1]));
            }
        }
        Integer min = Integer.MAX_VALUE;
        Integer idx = 0;
        for (int i = 0; i < diff.length; i++) {
            if (min.compareTo(diff[i]) > 0) {
                min = diff[i];
                idx = i;
            }
        }
        if (idx.equals(len - 1)) {
            System.out.println(String.valueOf(idx + 1) + " 1");
        } else {
            System.out.println(String.valueOf(idx + 1) + " " + String.valueOf(idx + 2));
        }
    }

}
