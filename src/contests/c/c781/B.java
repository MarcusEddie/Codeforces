package contests.c.c781;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int[] slot = new int[len];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < input.length; i++) {
                slot[i] = Integer.valueOf(input[i]);
                if (min > slot[i]) {
                    min = slot[i];
                }
            }
            int left = len;
            while (left != 1) {
                int min2 = Integer.MAX_VALUE;
                left--;
                for (int i = 0; i < slot.length; i++) {
                    slot[i] = slot[i] - min;
                    if (slot[i] > 0) {
                        if (slot[i] < min2) {
                            min2 = slot[i];
                        }
                    } else {
                        slot[i] = -1;
                    }
                }
                min = min2;
            }
            
            boolean flag = true;
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] > 0) {
                    if (slot[i] > 1) {
                        flag = false;
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
