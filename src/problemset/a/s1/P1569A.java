package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1569/A
 */
public class P1569A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            Integer l = -1;
            Integer r = -1;
            Integer na = 0;
            Integer nb = 0;
            boolean flag = false;
            for(int i = 0; i < len; i++) {
                for(int j = i; j < len; j++) {
                    if (input.charAt(j) == 'a') {
                        na++;
                    } else {
                        nb++;
                    }
                    if (l.compareTo(-1) == 0) {
                        l = j + 1;
                    } else {
                        r = j + 1;
                    }
                    if (na.compareTo(nb) == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
                l = -1;
                r = -1;
                na = 0;
                nb = 0;
            }
            rs.add(String.valueOf(l) + " " + String.valueOf(r));
        }
        
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
