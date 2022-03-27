package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/490/A
 * @author ey
 *
 */
public class P490A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String[] input = br.readLine().split(" ");
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }
        if (set.size() < 3) {
            System.out.println(0);
        } else {
            List<Integer> coder = new ArrayList<Integer>();
            List<Integer> math = new ArrayList<Integer>();
            List<Integer> pe = new ArrayList<Integer>();
            for (int i = 0; i < input.length; i++) {
                if (input[i].equals("1")) {
                    coder.add(i + 1);
                } else if (input[i].equals("2")) {
                    math.add(i + 1);
                } else {
                    pe.add(i + 1);
                }
            }
            Integer min = coder.size();
            if (math.size() < min) {
                min = math.size();
            }
            if (pe.size() < min) {
                min = pe.size();
            }
            System.out.println(min);
            for (int i = 0; i < min; i++) {
                System.out.println(String.valueOf(coder.get(i)) + " " + String.valueOf(math.get(i)) + " " + String.valueOf(pe.get(i)));
            }
        }
    }
}
