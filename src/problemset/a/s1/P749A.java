package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/749/A
 * @author ey
 *
 */
public class P749A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        Integer input1 = input % 2 == 0? input : input - 1;
        Boolean addOne = false;
        if (!input.equals(input1)) {
            addOne = true;
        }
        for (int i = 0; i < input1 / 2; i++) {
            if (i == 0 && addOne) {
                rs.add(3);
            } else {
                rs.add(2);
            }
        }
        System.out.println(rs.size());
        for (Integer integer : rs) {
            System.out.print(integer);
            System.out.print(" ");
        }
    }
}
