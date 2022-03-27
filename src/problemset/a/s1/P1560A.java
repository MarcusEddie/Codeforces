package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1560/A
 * @author ey
 *
 */
public class P1560A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[1000];
        int cursor = 0;
        int counter = 0;
        while (cursor < 1000) {
            counter++;
            if (counter % 3 == 0) {
                continue;
            } else if (counter % 10 == 3) {
                continue;
            }
            nums[cursor] = counter;
            cursor++;
        }
        Integer cnt = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            int input = Integer.valueOf(br.readLine());
            rs.add(nums[input - 1]);
            cnt--;
        }
        for (int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i));
        }
    }
}
