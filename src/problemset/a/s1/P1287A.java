package problemset.a.s1;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/1287/A
 * @author ey
 *
 */
public class P1287A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            Integer tmp = 0;
            int[] arr = new int[len];
            for(int i = 0; i < input.length(); i++) {
                arr[i] = input.charAt(i) == 'A' ? 0 : 1;
            }
            while (true) {
                int i = 0;
                boolean flag = false;
                while (i < arr.length - 1) {
                    if(arr[i] == 0 && arr[i + 1] == 1) {
                        arr[i +1] = 0;
                        flag = true;
                        i = i + 2;
                    } else {
                        i++;
                    }
                }
                if (!flag) {
                    break;
                }
                tmp++;
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
