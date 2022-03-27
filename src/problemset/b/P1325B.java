package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/1325/B 
 * @author ey
 *
 */
public class P1325B {

    public static void main(String[] args) throws IOException{
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(bReader.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer length = Integer.valueOf(bReader.readLine());
            String[] input = bReader.readLine().split(" ");
            Set<String> tmp = new HashSet<String>();
            for (int i = 0; i < input.length; i++) {
                tmp.add(input[i]);
            }
            rs.add(tmp.size());
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
