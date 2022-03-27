package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * https://codeforces.com/problemset/problem/339/A
 * @author ey
 *
 */
public class P339A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.length() == 1) {
            System.out.println(input);
        } else {
            String[] inputs = input.split("\\+");
            Map<String, Integer> counter = new HashMap<String, Integer>();
            StringBuffer rs = new StringBuffer();
            for (int i = 0; i < inputs.length; i++) {
                if (counter.containsKey(inputs[i])) {
                    Integer tmp = counter.get(inputs[i]);
                    counter.put(inputs[i], tmp +1);
                } else {
                    counter.put(inputs[i], 1);
                }
            }
            for (int i = 1; i < 4; i++) {
                if (counter.containsKey(String.valueOf(i))) {
                    Integer cnt = counter.get(String.valueOf(i));
                    while(cnt > 0) {
                        rs.append(i).append("+");
                        cnt--;
                    }
                }
            }
            System.out.println(rs.substring(0, rs.length() - 1));
        }
    }

}
