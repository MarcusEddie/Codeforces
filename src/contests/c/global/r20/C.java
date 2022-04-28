package contests.c.global.r20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer ans = 0;
            String[] nx = io.readLine().split(" ");
            String[] input = io.readLine().split(" ");
            Integer x = Integer.valueOf(nx[1]);
            int[] slot = new int[input.length];
            int tmp = 0;
            for (int i = 0; i < slot.length; i++) {
                slot[i] = Integer.valueOf(input[i]);
            }
            Arrays.sort(slot);
            for (int i = 0; i < slot.length; i++) {
                if (i > 0) {
                    slot[i] = slot[i] + slot[i - 1];
                }
                if (slot[i] <= x) {
                    tmp++;
                } else {
                    break;
                }
            }
            System.out.println(Arrays.toString(slot) + " " + ans);
            if (tmp > 0) {
                for (int i = 0; i < slot.length; i++) {
                    ans += ((x - slot[i]) / (i + 1)) + 1;
                }
            }
            rs.add(ans);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
