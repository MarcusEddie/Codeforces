package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P701A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        int[] nums = new int[input.length];
        Integer sum = 0;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.valueOf(input[i]);
            sum = sum + nums[i];
            if (map.containsKey(Integer.valueOf(input[i]))) {
                List<Integer> tmp = map.get(Integer.valueOf(input[i]));
                tmp.add(i);
                map.put(Integer.valueOf(input[i]), tmp);
            } else {
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(i);
                map.put(Integer.valueOf(input[i]), tmp);
            }
        }
        sum = sum / (len / 2);
//        System.out.println(sum);
//        System.out.println(map.toString());
        List<String> rs = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                List<Integer> tmp = map.get(sum - nums[i]);
//                System.out.println(sum + " " + nums[i] + " " + (sum - nums[i]) + " " + tmp.toString());
                if (tmp.get(0).equals(i)) {
                    tmp.remove(0);
                }
                nums[tmp.get(0)] = 0;
                rs.add((i + 1) + " " + (tmp.get(0) + 1));
                tmp.remove(0);
                map.put(sum - nums[i], tmp);
                tmp = map.get(nums[i]);
//                System.out.println(nums[i]+ " " + tmp.toString());
                if (tmp.size() > 0) {
                    tmp.remove(0);
                    map.put(nums[i], tmp);
                }
                nums[i] = 0;
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
