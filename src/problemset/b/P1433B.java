package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1433B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            boolean flag = false;
            int tmp = 0;
            int sum = 0;
            Integer s1 = 0;
            Integer s2 = 0;
            Integer cursor = -1;
            for (int i = 0; i < input.length; i++) {
                if (input[i].equals("1") && cursor.compareTo(0) < 0) {
                    cursor = i;
                }
            }
            
            boolean allOne = true;
            if (input[cursor].equals("0") && input[input.length - 1].equals("1") || input[cursor].equals("1") && input[input.length - 1].equals("0") ) {
                allOne = false;
            }
            for (int i = cursor; i < input.length; i++) {
                if (input[i].equals("1")) {
                    flag = true;
                    if (s1.compareTo(0) == 0) {
                        s1 = i + 1;
                    }
                    s2++;
                    sum = sum + i + 1;
                }
                if (flag && input[i].equals("0")) {
                    tmp++;
                }
            }
            if (sum == (((s1 + s1 + s2 - 1) * s2) / 2)) {
                rs.add(0);
            } else {
                if (!allOne) {
                    if ((len - cursor) / 2 <= tmp) {
                        tmp = len - (cursor) - 1 - tmp;
                    }
                }
                rs.add(tmp);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
