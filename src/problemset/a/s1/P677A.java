package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * https://codeforces.com/problemset/problem/677/A
 * @author ey
 *
 */
public class P677A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] thresholds = br.readLine().split(" ");
        String[] heights = br.readLine().split(" ");
        Integer rs = Integer.valueOf(thresholds[0]);
        Integer height = Integer.valueOf(thresholds[1]);
        for (int i = 0; i < heights.length; i++) {
            if (height.compareTo(Integer.valueOf(heights[i])) < 0) {
                rs++;
            }
        }
        System.out.println(rs);
    }
}
