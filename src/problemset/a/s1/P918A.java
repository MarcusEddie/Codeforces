package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P918A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        int i = 1;
        int j = 1;
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        while (j <= n) {
            j = i + j;
            i = j - i;
            set.add(j);
        }
        StringBuffer rs = new StringBuffer();
        int len = 1;
        while (len <= n) {
            if (set.contains(Integer.valueOf(len))) {
                rs.append("O");
            } else {
                rs.append("o");
            }
            len++;
        }
        System.out.println(rs.toString());
    }

}
