package contests.c.c776;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String s = io.readLine();
            String c = io.readLine();
            boolean flag = false;
            if (s.length() == 1 && !s.equals(c)) {
                rs.add("NO");
            } else if (s.length() == 1 && s.equals(c)) {
                rs.add("YES");
            } else if (s.equals(c)) {
                rs.add("YES");
            } else {
                for(int i = 0; i < s.length(); i++) {
                    if (c.equals(String.valueOf(s.charAt(i)))) {
                        if((i) % 2 == 0 && ((s.length() - (i + 1)) % 2 == 0)) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
