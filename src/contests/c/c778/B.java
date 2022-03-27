package contests.c.c778;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            StringBuilder input = new StringBuilder(io.readLine());
            boolean flag = true;
            int idx = 0;
            while(flag) {
                String first = String.valueOf(input.charAt(idx));
                int lastIdx = input.lastIndexOf(first);
                if (lastIdx > idx && lastIdx >= 0) {
                    idx++;
                } else {
                    flag = false;
                }
            }
            rs.add(input.substring(idx));
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
