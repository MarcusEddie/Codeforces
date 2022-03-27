package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1480A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            int min = (char)'a';
            int max = (char)'z';
            StringBuffer tmp = new StringBuffer();
            for(int i = 0; i < input.length();i ++) {
                if (i % 2 == 0) {
                    if (input.charAt(i) == min) {
                        tmp.append((char)(min+1));
                    } else {
                        tmp.append((char)(min));
                    }
                } else {
                    if (input.charAt(i) != max) {
                        tmp.append((char)(max));
                    } else {
                        tmp.append((char)(max - 1));
                    }
                }
            }
            rs.add(tmp.toString());
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
