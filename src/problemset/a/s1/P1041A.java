package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1041/A
 * @author ey
 *
 */
public class P1041A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        if (cnt == 1) {
            System.out.println(0);
        } else {
            List<Integer> tmp = new ArrayList<Integer>(); 
            for (int i = 0; i < input.length; i++) {
                tmp.add(Integer.valueOf(input[i]));
            }
            Collections.sort(tmp);
            
            Integer sum = 0;
            for(int i = 1; i < tmp.size(); i++) {
                sum = sum + (tmp.get(i) - tmp.get(i - 1) - 1);
            }
            System.out.println(sum);
        }
    }
}
