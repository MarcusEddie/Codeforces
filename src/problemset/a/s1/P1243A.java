package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1243A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int max = 0;
            for (int i = 0; i < input.length; i++) {
                if (max < Integer.valueOf(input[i])) {
                    max = Integer.valueOf(input[i]);
                }
            }
            
            int temp = 0;
            for(int i = max; i > 0; i--) {
                int tmp = 0;
                boolean flag = false;
                for (int j = 0; j < input.length; j++) {
                    if (i <= Integer.valueOf(input[j])) {
                        tmp++;
                    }
                    if (tmp >= i) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    temp = i;
                    break;
                }
            }
            rs.add(temp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
