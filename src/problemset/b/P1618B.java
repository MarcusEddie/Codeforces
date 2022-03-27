package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1618/B
 */
public class P1618B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            String tmp = input[0];
            if (input.length == 1) {
                tmp = tmp + "a";
            } else {
                for (int i = 1; i < input.length; i++) {
                    if (tmp.charAt(tmp.length() - 1) == input[i].charAt(0)) {
                        tmp = tmp + String.valueOf(input[i].charAt(1));
                    } else {
                        tmp = tmp + input[i];
                    }
                }
                if (tmp.length() < len) {
                    for (int i = 0; i < len - tmp.length(); i++) {
                        tmp = tmp + "a";
                    }
                }
                
            }
            rs.add(tmp);
        }
        for (String string : rs) {
            System.out.println(string);
        }
        
    }

}
