package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1623/A
 */
public class P1623A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Integer n = Integer.valueOf(input[0]);
            Integer m = Integer.valueOf(input[1]);
            Integer rb = Integer.valueOf(input[2]);
            Integer cb = Integer.valueOf(input[3]);
            Integer rd = Integer.valueOf(input[4]);
            Integer cd = Integer.valueOf(input[5]);
            if (rb == rd || cb == cd) {
                rs.add(0);
            } else {
                if (rb > rd && cb > cd) {
                    if (n - (rb + m - cb) >= cb - cd) {
                        rs.add(m - cb + m - cd);
                    } else if (rb == n && (n - (m - cb) - rd) > (m - cd)) {
                        rs.add(m - cb + m - cd);
                    } else if (rb == n && (n - (m - cb) - rd) <= (m - cd)) {
                        rs.add(m - cb + (n - (m - cb) - rd));
                    } else {
                        rs.add(m - cb + n - (rb + m - cb) + (m - (n - (rb + m - cb)) - cd));
                    }
                } else if (rb > rd && cb < cd) {
                    if (n - rb >= cd - cb) {
                        rs.add(cd - cb);
                    } else {
                        if (n - rd > cd - (cb + n - rb)) {
                            rs.add(n - rb + cd - (cb + n - rb));
                        } else {
                            rs.add(n - rb + n - rd);
                        }
                    }
                } else if (rb < rd && cb < cd) {
                    if (rd - rb < cd - cb) {
                        rs.add(rd - rb);
                    } else {
                        rs.add(cd - cb);
                    }
                } else {
                    if (rd - (rb + m - cb) >= m - cd) {
                        rs.add(m - cb + m - cd);
                    } else {
                        rs.add(m - cb + rd - (rb + m - cb));
                    }
                }
            }
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
