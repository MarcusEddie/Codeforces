package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class P1167A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            if (len.compareTo(11) >= 0) {
                if (input.indexOf("8") >= 0 && input.indexOf("8") < input.length() - 10) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            } else {
                rs.add("NO");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
