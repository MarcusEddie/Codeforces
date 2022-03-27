package contests.c.c776;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class E {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            String[] nd = io.readLine().split(" ");
            Long n = Long.valueOf(nd[0]);
            Integer d = Integer.valueOf(nd[1]);
            String[] input = io.readLine().split(" ");
            int[] nums = new int[d + 1];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < input.length; i++) {
                if (i == 0) {
                    nums[Integer.valueOf(input[i])] = Integer.valueOf(input[i]) - 1;
                } else {
                    nums[Integer.valueOf(input[i])] = Integer.valueOf(input[i]) - Integer.valueOf(input[i - 1]);
                }
                if (min > nums[Integer.valueOf(input[i])]) {
                    min = nums[Integer.valueOf(input[i])];
                }
            }
        }
    }

}
