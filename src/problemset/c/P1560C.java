package problemset.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1560/C
 * @author ey
 *
 */
public class P1560C {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Long input = Long.valueOf(io.readLine());
            if (input.compareTo(1L) == 0) {
                rs.add("1 1");
            } else {
                
            Long i = 1L;
            int j = 1;
            while (true) {
                if (input.compareTo(i * i) > 0 && input.compareTo((i + 1L)*( i+1L)) <=0) {
                    break;
                }
                i++;
            }
            Long diff = input - i * i;
            String tmp = "";
            if (diff > i) {
                diff = diff - i - 1;
                tmp = String.valueOf(i + 1) + " " + String.valueOf(i + 1 - diff);
            } else {
                tmp = String.valueOf(diff) + " " + String.valueOf(i + 1);
            }
            rs.add(tmp);
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
