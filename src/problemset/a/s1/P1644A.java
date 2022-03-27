package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1644A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            int[] keys = new int[3];
            boolean flag = true;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == 'R') {
                    if (keys[0] != 1) {
                        flag = false;
                    }
                } else if (input.charAt(i) == 'G') {
                    if (keys[1] != 1) {
                        flag = false;
                    }
                } else if (input.charAt(i) == 'B') {
                    if (keys[2] != 1) {
                        flag = false;
                    }
                } else if (input.charAt(i) == 'r') {
                    keys[0] = 1;
                } else if (input.charAt(i) == 'g') {
                    keys[1] = 1;
                } else if (input.charAt(i) == 'b') {
                    keys[2] = 1;
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
