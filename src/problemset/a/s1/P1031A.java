package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1031A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] input = io.readLine().split(" ");
        Integer w = Integer.valueOf(input[0]);
        Integer h = Integer.valueOf(input[1]);
        Integer k = Integer.valueOf(input[2]);
        Integer rs = 0;
        for(int i =1; i <=k ;i++) {
            int wt = w - 4 *(i - 1);
            int ht = h - 4 *(i - 1);
            rs =rs + 2 * ht + 2 * (wt - 2);
        }
        System.out.println(rs);
    }
}
