package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1207/A
 * 
 * @author ey
 *
 */
public class P1207A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] bpf = io.readLine().split(" ");
            Integer tmp = 0;
            Integer b = Integer.valueOf(bpf[0]);
            Integer p = Integer.valueOf(bpf[1]);
            Integer f = Integer.valueOf(bpf[2]);
            String[] hc = io.readLine().split(" ");
            Integer h = Integer.valueOf(hc[0]);
            Integer c = Integer.valueOf(hc[1]);
            if (h.compareTo(c) <= 0) {
                if (2 * f <= b) {
                    tmp = tmp + c * f;
                    b = b - 2 * f;
                    if (b > 1) {

                        if (2 * p <= b) {
                            tmp = tmp + h * p;
                        } else {
                            if (b % 2 == 0) {
                                tmp = tmp + (b / 2) * h;
                            } else {
                                tmp = tmp + ((b - 1) / 2) * h;
                            }
                        }
                    }
                } else {
                    if (b > 1) {

                        if (b % 2 == 0) {
                            tmp = tmp + (b / 2) * c;
                        } else {
                            tmp = tmp + ((b - 1) / 2) * c;
                        }
                    }
                }
            } else {
                if (2 * p <= b) {
                    tmp = tmp + p * h;
                    b = b - 2 * p;
                    if (b > 1) {

                        if (2 * f <= b) {
                            tmp = tmp + f * c;
                        } else {
                            if (b % 2 == 0) {
                                tmp = tmp + (b / 2) * c;
                            } else {
                                tmp = tmp + ((b - 1) / 2) * c;
                            }
                        }
                    }
                } else {
                    if (b > 1) {

                        if (b % 2 == 0) {
                            tmp = tmp + (b / 2) * h;
                        } else {
                            tmp = tmp + ((b - 1) / 2) * h;
                        }
                    }
                }
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
