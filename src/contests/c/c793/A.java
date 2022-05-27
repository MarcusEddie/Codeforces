package contests.c.c793;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            StringBuilder str = new StringBuilder(io.readLine());
            int tmp = 1;
            if (str.length() == 2) {
                rs.add(2);
                continue;
            }
            boolean flag = true;
            if (str.length() % 2 == 1) {
                flag = false;
                tmp = 1;
            }
            int i = str.length() / 2;
            if (flag) {
                i--;
            }
            int left = i;
            while (left > 0) {
                if (str.charAt(left) != str.charAt(left - 1)) {
                    break;
                }else {
                    tmp++;
                    left--;
                }
            }
            if (!flag) {
                tmp = tmp * 2 - 1;
            } else {
                tmp = tmp * 2;
            }
            rs.add(tmp);
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
