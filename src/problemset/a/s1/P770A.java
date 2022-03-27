package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P770A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = io.readLine().split(" ");
        Integer n = Integer.valueOf(nk[0]);
        Integer k = Integer.valueOf(nk[1]);
        StringBuffer rs = new StringBuffer();
        int i = 0;
        while (rs.length() <= n) {
            if (i > k - 1) {
                i = 0;
            }
            rs.append((char)(97 + i));
            i++;
        }
        System.out.println(rs.substring(0, rs.length() - 1).toString());
    }

}
