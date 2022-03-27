package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1561A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int[] nums = new int[input.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.valueOf(input[i]);
            }
            int tmp =1;
            while (true) {
                boolean flag = true;
                if (tmp % 2 ==1) {
                    for(int i = 0; i < len - 1; i = i + 2) {
                        if (nums[i] != i + 1 || nums[i + 1] != i + 2) {
                            flag = false;
                        }
                        if (nums[i] > nums[i + 1]) {
                            nums = exchange(nums, i, i + 1);
                        }
                    }
                } else {
                    for(int i = 1; i < len; i = i + 2) {
                        if (nums[i] != i + 1 || nums[i + 1] != i + 2) {
                            flag = false;
                        }
                        if (nums[i] > nums[i+1] ) {
                            nums = exchange(nums, i, i + 1);
                        }
                    }
                }
                if (flag) {
                    break;
                }
                tmp++;
            }
            tmp--;
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

    public static int[] exchange(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
        return nums;
    }
}
