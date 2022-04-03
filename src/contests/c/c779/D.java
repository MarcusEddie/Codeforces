package contests.c.c779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class D {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            String[] lr = io.readLine().split(" ");
            String[] input = io.readLine().split(" ");
            Long r = Long.valueOf(lr[1]);
            Long min = Long.MAX_VALUE;
            Long max = 0L;
            for (int i = 0; i < input.length; i++) {
                Long tmp = Long.valueOf(input[i]);
                if (min.compareTo(tmp) > 0) {
                    min = tmp;
                }
                if (max.compareTo(tmp) < 0) {
                    max = tmp;
                }
            }
            if (max.compareTo(r) == 0) {
                rs.add(0L);
            } else if (min.compareTo(r) > 0) {
                rs.add(min);
            } else if (max.compareTo(r) > 0 && min.compareTo(r) < 0) {
                rs.add(max);
            }
        }
        for (Long integer : rs) {
            System.out.println(integer);
        }
    }

}
