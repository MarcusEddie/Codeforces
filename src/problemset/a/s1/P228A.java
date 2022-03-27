package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 * https://codeforces.com/problemset/problem/228/A
 */
public class P228A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Set<String> rs = new HashSet<String>();
        for (int i = 0; i < input.length; i++) {
            rs.add(input[i]);
        }
        System.out.println(4 - rs.size());
    }
}
