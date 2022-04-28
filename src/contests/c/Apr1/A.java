package contests.c.Apr1;

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
            String input = io.readLine();
            int pre = 0;
            boolean flag = true;
            for (int i = 1; i < input.length(); i++) {
                int len = 0;
                if (input.charAt(i) != input.charAt(i - 1)) {
                    len = i - pre;
                    if (len < 2) {
                        flag = false;
                        break;
                    }
                    //System.out.println(input.substring(pre, i - 1) + " " + (i - pre));
                    pre = i;
                }
                if (i == input.length() - 1) {
//                    System.out.println(i - pre + 1);
                    len = i - pre + 1;
                    if (len < 2) {
                        flag = false;
                        break;
                    }
                }
            }
            if (input.length() > 1 && flag) {
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
