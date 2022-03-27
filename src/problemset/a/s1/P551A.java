package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P551A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String[] rates = io.readLine().split(" ");
        int[] cnt = new int[2001];
        for (int i = 0; i < rates.length; i++) {
            Integer rate = Integer.valueOf(rates[i]);
            cnt[rate] = cnt[rate] + 1;
        }
        int vol = 1;
        for (int i = 2000; i > 0; i--) {
            if (cnt[i] != 0) {
                int tmp = cnt[i];
                cnt[i] = vol;
                vol = tmp + vol;
            }
        }
        StringBuffer rs = new StringBuffer();
        for (int i = 0; i < rates.length; i++) {
            rs.append(cnt[Integer.valueOf(rates[i])]).append(" ");
        }
        System.out.println(rs.toString());
    }

}
