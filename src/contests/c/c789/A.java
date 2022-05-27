package contests.c.c789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int[] slot = new int[input.length];
            int zero = 0;
            for (int i = 0; i < slot.length; i++) {
                slot[i] = Integer.valueOf(input[i]);
                if (slot[i] == 0) {
                    zero++;
                }
            }
            Arrays.sort(slot);
            boolean hasSame = false;
            for (int i = 0; i < slot.length - 1; i++) {
                if (slot[i]== slot[i + 1]) {
                    hasSame = true;
                    break;
                }
            }
            int tmp = 3;
            if (slot[0] == 0) {
                tmp = slot.length - zero;
                rs.add(tmp);
                continue;
            } else if (hasSame) {
                tmp = 2;
            }
            tmp = tmp + slot.length - 2;
            rs.add(tmp);
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
