package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1301A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String a = io.readLine();
            String b = io.readLine();
            String c = io.readLine();
            Boolean flag = true;
            for (int i = 0; i < c.length(); i++) {
                if (c.charAt(i) != a.charAt(i) && c.charAt(i) != b.charAt(i) ) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                rs.add("YES");
            } else {
                rs.add("NO");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
