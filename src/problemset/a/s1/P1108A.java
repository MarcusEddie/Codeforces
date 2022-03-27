package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1108/A
 * @author ey
 *
 */
public class P1108A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt  =Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Integer l1 = Integer.valueOf(input[0]);
            Integer r1 = Integer.valueOf(input[1]);
            Integer l2 = Integer.valueOf(input[2]);
            Integer r2 = Integer.valueOf(input[3]);
            String tmp = String.valueOf(l1);
            if (!l2.equals(l1)) {
                tmp = tmp + " "+ String.valueOf(l2);
            } else {
                tmp = tmp + " " + String.valueOf(r2); 
            }
            rs.add(tmp);
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
