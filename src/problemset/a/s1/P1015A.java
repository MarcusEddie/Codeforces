package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1015A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        Integer n = Integer.valueOf(nm[0]);
        Integer m = Integer.valueOf(nm[1]);
        int[] axis = new int[m +1];
        while (n > 0) {
            n--;
            String[] input = io.readLine().split(" ");
            Integer l = Integer.valueOf(input[0]);
            Integer r = Integer.valueOf(input[1]);
            for(int i = l; i <= r; i++) {
                axis[i] = 1;
            }
        }
        String rs = "";
        Integer cnt = 0;
        for (int i = 1; i < axis.length; i++) {
            if (axis[i] != 1) {
                cnt++;
                rs = rs + " " + String.valueOf(i);
            }
        }
        System.out.println(cnt);
        System.out.println(rs.length() > 0 ? rs.substring(1) : "");
    }

}
