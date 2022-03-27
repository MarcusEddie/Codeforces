package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P780A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        Integer rs = 0;
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < input.length; i++) {
            
            if (set.contains(input[i])) {
                set.remove(input[i]);
            } else {
                set.add(input[i]);
                if (rs < set.size()) {
                    rs = set.size();
                }
            }
        }
        System.out.println(rs);
    }

}
