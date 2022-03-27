package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * https://codeforces.com/problemset/problem/236/A
 * @author ey
 *
 */
public class P236A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Map<String, String> counter = new HashMap<String, String>();
        for (int i = 0; i < input.length(); i++) {
            if (!counter.containsKey(String.valueOf(input.charAt(i)))) {
                counter.put(String.valueOf(input.charAt(i)), String.valueOf(input.charAt(i)));
            }
        }
        if (counter.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
