package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1065A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Long s = Long.valueOf(input[0]);
            Long a = Long.valueOf(input[1]);
            Long b = Long.valueOf(input[2]);
            Long c = Long.valueOf(input[3]);
            Long tmp = s / c;
            tmp = (tmp / a) * b + tmp;
            rs.add(tmp);
        }
        for (Long long1 : rs) {
            System.out.println(long1);
        }
    }
}
