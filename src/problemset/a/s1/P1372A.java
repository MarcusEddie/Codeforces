package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/1372/A
 * @author ey
 *
 */
public class P1372A {

    public static void main(String[] args) throws IOException{
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(re.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(re.readLine());
            int[] slot = new int[1001];
            Integer sumN = n * (n - 1) / 2;
            List<Integer> sums = new ArrayList<Integer>();
            Set<Integer> set = new HashSet<Integer>();
            Random random = new Random();
            while (sumN > 0) {
                int tmp = random.nextInt(1001);
                if (set.add(tmp)) {
                    sums.add(random.nextInt(1001));
                    sumN--;
                }
            }
            
            String tmp = "1";
            for(int i = 0; i < sums.size() - 1; i++) {
                tmp = tmp + " " + String.valueOf(sums.get(i) - 1);
            }
            rs.add(tmp);
        }
        for (String string : rs) {
            System.out.println(string);
        }
        
    }

}
