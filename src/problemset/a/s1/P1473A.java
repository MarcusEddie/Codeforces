package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1473/A
 */
public class P1473A {

    public static void main(String[] args) throws IOException{
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(re.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] input = re.readLine().split(" ");
            String[] array = re.readLine().split(" ");
            Integer n = Integer.valueOf(input[0]);
            Integer d = Integer.valueOf(input[1]);
            Integer min = Integer.MAX_VALUE;
            Integer max = 0;
            List<Integer> nums = new ArrayList<Integer>();
            for (int i = 0; i < array.length; i++) {
                nums.add(Integer.valueOf(array[i]));
            }
            Collections.sort(nums);
            if (d.compareTo(nums.get(0) + nums.get(1)) >= 0) {
                rs.add("YES");
            } else {
                if (d.compareTo(nums.get(nums.size() - 1)) >= 0) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
