package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1038A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = io.readLine().split(" ");
        String input = io.readLine();
        Integer k = Integer.valueOf(nk[1]);
        int[] cnt = new int[26];
        for(int i = 0; i < input.length(); i++) {
            cnt[input.charAt(i) - 65] = cnt[input.charAt(i) - 65] + 1;
        }
        if (cnt[k - 1] == 0) {
            System.out.println(0);
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                if (min > cnt[i]) {
                    min = cnt[i];
                }
            }
            System.out.println(min * k);
        }
    }

}
