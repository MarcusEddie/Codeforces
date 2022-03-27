package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/1228/A
 */
public class P1228A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] lr = io.readLine().split(" ");
        Integer l = Integer.valueOf(lr[0]);
        Integer r = Integer.valueOf(lr[1]);
        Integer rs = 0;
        for(int i = l; i <= r; i++) {
            String tmp = String.valueOf(i);
            boolean flag = false;
            for(int j = 0; j < tmp.length(); j++) {
                if (tmp.lastIndexOf(String.valueOf(tmp.charAt(j))) != j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                rs = i;
                break;
            }
        }
        if (rs == 0) {
            System.out.println(-1);
        } else {
            System.out.println(rs);
        }
        
    }

}
