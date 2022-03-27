package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/978/A
 * @author ey
 *
 */
public class P978A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }
        String rs = "";
        System.out.println(set.size());
        for(int i = input.length -1; i >=0;i--) {
            if (set.contains(input[i])) {
                rs = input[i] + " " + rs;
                set.remove(input[i]);
            }
        }
        System.out.println(rs);
    }

}
