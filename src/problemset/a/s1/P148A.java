package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/148/A
 * 
 * @author ey
 *
 */
public class P148A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(Integer.valueOf(br.readLine()));
        tmp.add(Integer.valueOf(br.readLine()));
        tmp.add(Integer.valueOf(br.readLine()));
        tmp.add(Integer.valueOf(br.readLine()));
        Collections.sort(tmp);

        Integer cnt = Integer.valueOf(br.readLine());
        Integer k = tmp.get(0);
        Integer l = tmp.get(1);
        Integer m = tmp.get(2);
        Integer n = tmp.get(3);
        // k，了，m，n四個中任意兩個之間如果有公約數，那麼，每對中較大者會覆蓋，所以不再判定
        if (l % k == 0) {
            l = 0;
        }
        if (m % k == 0) {
            m = 0;
        } else if (l != 0 && m % l == 0) {
            m = 0;
        }
        if (n % k == 0) {
            n = 0;
        } else if (l != 0 && n % l == 0) {
            n = 0;
        } else if (m != 0 && n % m == 0) {
            n = 0;
        }

        int[] slot = new int[cnt];
        for (int i = 0; i < slot.length; i++) {
            if ((i + 1) % k == 0) {
                slot[i] = 1;
            }
        }
        if (l != 0) {
            for (int i = 0; i < slot.length; i++) {
                if ((i + 1) % l == 0) {
                    slot[i] = 1;
                }
            }
        }
        if (m != 0) {
            for (int i = 0; i < slot.length; i++) {
                if ((i + 1) % m == 0) {
                    slot[i] = 1;
                }
            }
        }
        if (n != 0) {
            for (int i = 0; i < slot.length; i++) {
                if ((i + 1) % n == 0) {
                    slot[i] = 1;
                }
            }
        }
        Integer rs = 0;
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] == 1) {
                rs++;
            }
        }
        System.out.println(rs);
    }
}
