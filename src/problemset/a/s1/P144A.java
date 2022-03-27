package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/144/A
 */
public class P144A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String[] heights = br.readLine().split(" ");
        Integer min = Integer.MAX_VALUE;
        Integer max = 0;
        Integer idxMin = 0;
        Integer idxMax = 0;
        for (int i = 0; i < heights.length; i++) {
            if (Integer.valueOf(heights[i]).compareTo(min) <= 0) {
                min = Integer.valueOf(heights[i]);
                idxMin = i;
            }
            if (Integer.valueOf(heights[i]).compareTo(max) > 0) {
                max = Integer.valueOf(heights[i]);
                idxMax = i;
            }
        }
        if (idxMax > idxMin) {
            System.out.println((cnt - 1 - idxMin) + (idxMax - 1));
        } else {
            System.out.println((cnt - 1 - idxMin) + idxMax);
        }
    }
}
