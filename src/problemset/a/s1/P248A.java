package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P248A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        Integer rs = 0;
        int left = 0;
        int right = 0;
        Integer len = cnt;
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            if (input[0].equals("1")) {
                left++;
            }
            if (input[1].equals("1")) {
                right++;
            }
        }
        if (left <= len / 2) {
            rs = rs + left;
        } else {
            rs = rs + len - left;
        }
        if (right <= len / 2) {
            rs = rs + right;
        } else {
            rs = rs + len - right;
        }
        System.out.println(rs);
    }

}
