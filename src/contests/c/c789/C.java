package contests.c.c789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Long a = Long.valueOf(input[0]);
            Long b = Long.valueOf(input[1]);
            Long c = Long.valueOf(input[2]);
            Long x = Long.valueOf(input[3]);
            Long y = Long.valueOf(input[4]);
            if (a + b + c - x - y < 0) {
                rs.add("NO");
                continue;
            }
            if(a >= x && b >= y) {
                rs.add("YES");
            } else if (a >= x && b < y) {
                if (b + c >= y) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            } else if (a < x && b >= y) {
                if (a + c >= x) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            } else {
                rs.add("YES");
            }
        }
        
        for (String integer : rs) {
            System.out.println(integer);
        }
    }

}
