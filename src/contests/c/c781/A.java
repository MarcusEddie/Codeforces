package contests.c.c781;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String[] st1 = io.readLine().split(" ");
            String[] st2 = io.readLine().split(" ");
            Integer tmp = 0;
            for (int i = 0; i < st2.length - 1; i++) {
                Integer a = Integer.valueOf(st1[i]);
                Integer b = Integer.valueOf(st1[i + 1]);
                Integer a1 = Integer.valueOf(st2[i]);
                Integer b1 = Integer.valueOf(st2[i + 1]);
                int sum1 = Math.abs(a - b) + Math.abs(a1 - b1);
                int sum2 = Math.abs(a - b1) + Math.abs(a1 - b);
                if (sum1 < sum2) {
                    tmp += sum1;
                } else {
                    tmp += sum2;
                }
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
