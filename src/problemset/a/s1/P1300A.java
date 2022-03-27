package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1300/A
 * 
 * @author ey
 *
 */
public class P1300A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            Boolean flag = false;
            Integer tmp = 0;
            while (!flag) {
                Integer sum = 0;
                boolean allNegative = true;
                for (int i = 0; i < input.length; i++) {
                    sum = sum + Integer.valueOf(input[i]);
                    if (input[i].equals("0")) {
                        input[i] = "1";
                        sum++;
                        tmp++;
                    }
                    if (Integer.valueOf(input[i]).compareTo(0) > 0) {
                        allNegative = false;
                    }
                }
                if (sum.compareTo(0) == 0) {
                        if (!allNegative) {
                            tmp++;
                            flag = true;
                        }
                } else if (sum.compareTo(0) != 0) {
                    flag = true;
                }
            }
            rs.add(tmp);
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
