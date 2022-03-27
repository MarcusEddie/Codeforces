package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P676A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        int max = 0;
        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 0; i < input.length; i++) {
            if (min > Integer.valueOf(input[i])) {
                min = Integer.valueOf(input[i]);
                minIdx = i + 1;
            }
            if (max < Integer.valueOf(input[i])) {
                max = Integer.valueOf(input[i]);
                maxIdx = i + 1;
            }
        }
        Integer rs = Math.abs(maxIdx - minIdx);
        if (minIdx == 1 || minIdx == n || maxIdx == 1 || maxIdx == n) {
            rs = n -1;
        } else {
            if (rs.compareTo(n - minIdx) <= 0 && !rs.equals(n - 1)) {
                rs = n - minIdx;
            }
            if(rs.compareTo(minIdx - 1) <=0  && !rs.equals(n - 1)) {
                rs = minIdx -1 ;
            }
            if (rs.compareTo(maxIdx - 1) <= 0 && !rs.equals(n - 1)) {
                rs = maxIdx - 1;
            }
            if (rs.compareTo(n - maxIdx) <= 0 && !rs.equals(n - 1)) {
                rs = n - maxIdx;
            }
        }
        System.out.println(rs);
    }
}
