package contests.c.Apr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int[] slot = new int[input.length];
            slot[0] = Integer.valueOf(input[0]);
            boolean flag = true;
            int times = 0;
            for (int i = 1; i < slot.length; i++) {
                slot[i] = Integer.valueOf(input[i]);
                if (slot[i] - slot[i - 1] != 1) {
                    if (slot[i] - slot[i - 1] > 3) {
                        flag = false;
                        break;
                    } else {
                        times++;
                        if (times >= 2) {
                            flag = false;
                            break;
                        }
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
