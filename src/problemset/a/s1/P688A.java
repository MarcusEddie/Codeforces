package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P688A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nd = io.readLine().split(" ");
        Integer n = Integer.valueOf(nd[0]);
        Integer d = Integer.valueOf(nd[1]);
        int[] nums = new int[d];
        int idx = 0;
        while (d > 0) {
            d--;
            String input = io.readLine();
            int tmp = 0;
            for(int i = 0; i<input.length(); i++) {
                if (input.charAt(i)=='1') {
                    tmp++;
                }
            }
            nums[idx++] = tmp;
        }
        int rs = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != n) {
                tmp++;
            } else {
                if (tmp > rs) {
                    rs = tmp;
                }
                tmp = 0;
            }
        }
        if (tmp > rs) {
            rs = tmp;
        }
        System.out.println(rs);
    }
}
