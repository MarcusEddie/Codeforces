package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1462/A
 */
public class P1462A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer length = Integer.valueOf(br.readLine());
            String[] input = br.readLine().split(" ");
            int sign = 1;
            String tmp = "";
            int i = 0; 
            int j = input.length - 1;
            while (i <= j) {
                tmp = tmp + " " + input[i];
                if (i != j) {
                    tmp = tmp + " " + input[j];
                }
                i++;
                j--;
            }
            rs.add(tmp.substring(1));
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
