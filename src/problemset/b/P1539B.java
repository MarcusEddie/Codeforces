package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1539/B
 * @author ey
 *
 */
public class P1539B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] np = io.readLine().split(" ");
        Integer n = Integer.valueOf(np[0]);
        Integer p = Integer.valueOf(np[1]);
        String input = io.readLine();
        List<Integer> rs = new ArrayList<Integer>();
        int[] nums = new int[input.length()];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            nums[i] = input.charAt(i) - 96 + sum;
            sum = nums[i];
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
        while (p > 0) {
            p--;
            String[] lr = io.readLine().split(" ");
            Integer l = Integer.valueOf(lr[0]);
            Integer r = Integer.valueOf(lr[1]);
            if (l.equals(1)) {
                rs.add(nums[r - 1]);
            } else {
                rs.add(nums[r - 1] - nums[l - 2]);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
