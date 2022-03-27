package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1632/A
 * @author ey
 *
 */
public class P1632A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            if (input.length() < 2) {
                rs.add("YES");
            } else if (input.length() == 2) {
                if (input.charAt(0) == input.charAt(1)) {
                    rs.add("NO");
                } else {
                    rs.add("YES");
                }
            }else {
                String tmp = "YES";
                for(int i = 2; i < len; i++) {
                    boolean flag = false;
                    
                    for(int j = 0; j <len; j++) {
                        StringBuffer sub = new StringBuffer(input.substring(j, j + i));
                        String reserveSub = sub.reverse().toString();
                        if (sub.toString().equals(reserveSub)) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        tmp = "NO";
                        break;
                    }
                }
                rs.add(tmp);
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
