package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1541/A
 * @author ey
 *
 */
public class P1514A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer input = Integer.valueOf(io.readLine());
            String tmp = "";
            if (input % 2 == 0) {
                for(int i = 2; i <= input; i=i+2) {
                    tmp = tmp + String.valueOf(i) + " " + String.valueOf(i - 1) + " ";
                }
            } else {
                tmp = "3 1 2 ";
                if (input > 3) {
                    
                for(int i = 5; i <=input; i = i+2) {
                    tmp = tmp + String.valueOf(i) + " " + String.valueOf(i - 1) + " ";
                }
                }
            }
            rs.add(tmp);
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
