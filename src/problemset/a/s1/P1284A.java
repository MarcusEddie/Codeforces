package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1284A {

    public static void main(String[] args)  throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        Integer n = Integer.valueOf(nm[0]);
        Integer m = Integer.valueOf(nm[1]);
        String[] s = io.readLine().split(" ");
        String[] t = io.readLine().split(" ");
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer i = Integer.valueOf(io.readLine());
            Integer idxS = i % s.length;
            Integer idxT = i % t.length;
            if (idxS == 0) {
                idxS = s.length;
            }
            if (idxT == 0) {
                idxT = t.length;
            }
            rs.add(s[idxS - 1] + t[idxT - 1]);
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
