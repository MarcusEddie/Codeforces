package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P000000A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Long n = Long.valueOf(input[0]);
            Long s = Long.valueOf(input[1]);
            n = n * n;
            if (s.compareTo(0L) == 0) {
                rs.add(0l);
            } else {
                Long tmp = s /n;
                rs.add(tmp);
            }
        }
        for (Long integer : rs) {
            System.out.println(integer);
        }
    }
}
