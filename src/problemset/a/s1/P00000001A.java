package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P00000001A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            List<Long> nums = new ArrayList<Long>();
            Long sum = 0L;
            for (int i = 0; i < input.length; i++) {
                nums.add(Long.valueOf(input[i]));
                sum = sum + Long.valueOf(input[i]);
            }
            Collections.sort(nums);
            Long sumR = nums.get(nums.size() - 1);
            Long sumB = nums.get(0) + nums.get(1);
            int cntB = input.length / 2;
            if (input.length %2 == 0) {
                cntB++;
            }
            for(int i = nums.size() - 1; i >= nums.size() - cntB; i--) {
                    sumR = sumR + nums.get(i);
            }
            for(int i = nums.size() - 1; i >= nums.size() - cntB; i--) {
                sumR = sumR + nums.get(i);
        }
            
//            System.out.println(sum);
            boolean flag = false;
            for(int i = nums.size() - 2; i >= 0; i--) {
                if (sumR.compareTo(sumB) > 0 && (i > cntB)&&(nums.size() - i - 1< cntB)) {
                    flag = true;
                    break;
                } else {
                    sumR = sumR + nums.get(i);
                    sumB = nums.get(cntB);
                    cntB++;
                    if (cntB >= nums.size()) {
                        break;
                    }
                }
                
            }
            if (flag) {
                rs.add("YES");
            } else {
                rs.add("NO");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
