package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 * https://codeforces.com/problemset/problem/469/A
 */
public class P469A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String[] p1 = br.readLine().split(" ");
        String[] p2 = br.readLine().split(" ");
        Set<String> rs = new HashSet<String>();
        for (int i = 1; i < p1.length; i++) {
            rs.add(p1[i]);
        }
        for (int i = 1; i < p2.length; i++) {
            rs.add(p2[i]);
        }
        if (rs.size() == cnt) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
