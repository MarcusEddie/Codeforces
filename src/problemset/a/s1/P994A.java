package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P994A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        String[] seq = io.readLine().split(" ");
        String[] keys = io.readLine().split(" ");
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < keys.length; i++) {
            set.add(keys[i]);
        }
        
        String rs = "";
        for (int i = 0; i < seq.length; i++) {
            if (set.contains(seq[i])) {
                rs = rs + " " + seq[i];
            }
        }
        if (rs.length() > 0) {
            rs = rs.substring(1);
        }
        System.out.println(rs);
    }
}
