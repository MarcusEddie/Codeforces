package problemset.a.s1;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1368/A
 */
public class P1368A {

    public static void main(String[] args) throws IOException{
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(re.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] input = re.readLine().split(" ");
            Integer a = Integer.valueOf(input[0]);
            Integer b = Integer.valueOf(input[1]);
            Integer n = Integer.valueOf(input[2]);
            Integer times = 0;
            while (a.compareTo(n) <= 0 && b.compareTo(n) <= 0) {
                Integer tmp = a + b;
                if (a.compareTo(b) < 0) {
                    a = tmp;
                } else {
                    b = tmp;
                }
                times++;
            }
            rs.add(times);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
