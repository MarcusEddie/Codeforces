package contests.c.c787;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int[] slot = new int[n];
            boolean asc = true;
            
            int tmp = 0;
            for (int i = 0; i < input.length; i++) {
                slot[i] = Integer.valueOf(input[i]);
                if (i > 0) {
                    if (slot[i] < slot[i - 1]) {
                        asc = false;
                    }
                }
                if (slot[i] == 0 && i != 0) {
                    tmp = -1;
                }
            }
            if (tmp < 0) {
                rs.add(tmp);
                continue;
            }
            if (asc) {
                rs.add(0);
                continue;
            }
            if (slot[n - 1] < n) {
                rs.add(-1);
                continue;
            }
            for (int i = n - 2; i >= 0; i--) {
                if (slot[i] < slot[i + 1]) {
                    continue;
                }
                while (slot[i] >= slot[i + 1]) {
                    tmp++;
                    slot[i] = slot[i] >> 1;
                }
                if (slot[i] == 0 && i != 0) {
                    tmp = -1;
                    break;
                }
            }
            rs.add(tmp);
            
        }
        for (Integer string : rs) {
            System.out.println(string);
        }
    }
}
