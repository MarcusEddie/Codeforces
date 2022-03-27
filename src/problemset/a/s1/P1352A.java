package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1352/A
 * @author ey
 *
 */
public class P1352A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<List<String>> rs = new ArrayList<List<String>>();
        while (cnt > 0) {
            Integer num = Integer.valueOf(br.readLine());
            List<String> tmp = new ArrayList<String>();
            
            Integer i = 0;
            while (true) {
                if (num % 10 != 0) {
                    Integer s = num - (num / 10) * 10;
                    tmp.add(String.valueOf(s * Math.pow(10, i)));
                }
                num = num / 10;
                i++;
                if (num <= 0) {
                    break;
                }
            }
            rs.add(tmp);
            cnt--;
        }
        for (int i = 0; i < rs.size(); i++) {
            List<String> tmp = rs.get(i);
            System.out.println(tmp.size());
            for (int j = 0; j < tmp.size(); j++) {
                System.out.print(tmp.get(j).substring(0, tmp.get(j).length() - 2));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
