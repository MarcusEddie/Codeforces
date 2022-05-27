package contests.c.c786;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Integer x = Integer.valueOf(input[0]);
            Integer y = Integer.valueOf(input[1]);
            if (x.compareTo(y) > 0) {
                rs.add("0 0");
                continue;
            } else if (x.compareTo(y) == 0) {
                rs.add("1 1");
                continue;
            } else  {
                if (y % x != 0) {
                    rs.add("0 0");
                    continue;
                }
            }
            y = y/ x;
            rs.add("1 " + y);
//            for (int i = 2; i <= 10; i++) {
//                int tmp = (int) Math.pow(y, 1.0D/i);
//                int product = (int) Math.pow(tmp, i);
//                if (product== y) {
//                    rs.add(i +" " + tmp);
//                    break;
//                }
//            }
            
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
