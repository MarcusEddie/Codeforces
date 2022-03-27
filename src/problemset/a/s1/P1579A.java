package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1579A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'A') {
                    a++;
                } else if (input.charAt(i) == 'B') {
                    b++;
                } else {
                    c++;
                }
            }
            if (b - a - c == 0) {
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
