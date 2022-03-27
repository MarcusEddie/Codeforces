package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1092A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Integer n = Integer.valueOf(input[0]);
            Integer k = Integer.valueOf(input[1]);
            StringBuffer tmp = new StringBuffer();
            int i = 0;
            while (tmp.length() < n) {
                tmp.append((char)(97 + i));
                i++;
                if (i % (k) == 0) {
                    i = 0;
                }
            }
            rs.add(tmp.toString());
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
