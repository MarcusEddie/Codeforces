package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1602A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            int min = 999;
            for(int i = 0; i < input.length(); i++) {
                if (min > input.charAt(i)) {
                    min = input.charAt(i);
                }
            }
            String tmp = String.valueOf((char)min);
            rs.add(tmp + " " + input.substring(0, input.indexOf(tmp)) + input.substring(input.indexOf(tmp) + 1)); 
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
