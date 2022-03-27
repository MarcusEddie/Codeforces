package contests.c.c778;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class C {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            if (n.equals(1)) {
                rs.add("YES");
            } else if (n.equals(2)) {
                if (Math.abs(Integer.valueOf(input[0]) - Integer.valueOf(input[1])) <= 1) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            } else {
                List<Long> nums = new ArrayList<Long>();
                for (int i = 0; i < input.length; i++) {
                    Long tmp = Long.valueOf(input[i]);
                    nums.add(tmp);
                }
                Collections.sort(nums);
                
                System.out.println(nums.toString());
                while (nums.size() > 2) {
                    Long tmp = nums.remove(0);
                    tmp = tmp + nums.remove(0);
                    nums.add(tmp);
                    Collections.sort(nums);
                    System.out.println(nums.toString());
                }
                System.out.println(nums.toString());
                if (Math.abs(nums.get(0) - nums.get(1)) <= 1) {
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
