package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1017A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        String[] ts = io.readLine().split(" ");
        Integer sumT = 0;
        for (int i = 0; i < ts.length; i++) {
            sumT = sumT + Integer.valueOf(ts[i]);
        }
        int rs = 1;
        while (cnt > 1) {
            cnt--;
            Integer sum = 0;
            String[] input = io.readLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                sum = sum + Integer.valueOf(input[i]);
            }
            if (sum.compareTo(sumT) > 0) {
                rs++;
            }
        }
        System.out.println(rs);
    }

}
