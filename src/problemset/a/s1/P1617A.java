package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1617A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String s = io.readLine();
            String t = io.readLine();

            int[] chars = new int[26];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < s.length(); i++) {
                chars[s.charAt(i) - 97] = chars[s.charAt(i) - 97] + 1;
                if (min > s.charAt(i) - 97) {
                    min = s.charAt(i) - 97;
                }
            }
            StringBuffer tmp = new StringBuffer();
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != 0) {
                    if (i == 0) {
                        a = chars[i];
                    }
                    if (i == 1) {
                        b = chars[i];
                    }
                    if (i == 2) {
                        c = chars[i];
                    }
                    for (int j = 0; j < chars[i]; j++) {
                        tmp.append(String.valueOf((char) (i + 97)));
                    }
                }
            }
//            System.out.println(tmp.toString());
            if (t.equals("abc") && a > 0 && b > 0 && c > 0) {
                String bs = "";
                for(int i = 0; i < b; i++) {
                    bs = bs +"b";
                }
                tmp.replace(a+c, a+b + c , bs);
                String cs = "";
                for(int i = 0; i < c; i++) {
                    cs = cs +"c";
                }
                tmp.replace(a, a + c, cs);
//                System.out.println(tmp.toString());
          }
            rs.add(tmp.toString());

        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
//1
//aaaaabbbbcccde