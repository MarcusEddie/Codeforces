package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * https://codeforces.com/problemset/problem/988/A
 */
public class P988A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] ns = io.readLine().split(" ");
        Integer n = Integer.valueOf(ns[0]);
        Integer s = Integer.valueOf(ns[1]);
        String[] input = io.readLine().split(" ");
        Set<String> set = new HashSet<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
            map.put(input[i], i + 1);
        }
        if (set.size() < s) {
            System.out.println("NO");
        } else {
            Iterator<String> it = set.iterator();
            String rs = "";
            while (it.hasNext() && s > 0) {
                String string = (String) it.next();
                rs = rs + " " + map.get(string);
                s--;
            }
            System.out.println("YES");
            System.out.println(rs.substring(1));
        }
    }

}
