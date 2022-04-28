package contests.c.global.r20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            int a = 0;
            int b = 0;
            boolean flag = true;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'B') {
                    b++;
                } else {
                    a++;
                }
                if(i > 0) {
                    if (input.charAt(i) == input.charAt(i - 1) && input.charAt(i) == 'B') {
                        flag = false;
                        break;
                    }
                }
                if (i == input.length() - 1) {
                    if (input.charAt(i) == 'A') {
                        flag = false;
                    }
                }
                if (i == 0) {
                    if (input.charAt(i) == 'B') {
                        flag = false;
                        break;
                    }
                }
            }
            if (!flag) {
                rs.add("NO");
            } else {
                if (a >= b && a > 0 && b > 0){
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
