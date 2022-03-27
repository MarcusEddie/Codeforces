package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P262A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = io.readLine().split(" ");
        Integer k = Integer.valueOf(nk[1]);
        String[] input = io.readLine().split(" ");
        Integer rs = 0;
        for (int i = 0; i < input.length; i++) {
                int tmp = 0;
                for (int j = 0; j < input[i].length(); j++) {
                    if (input[i].charAt(j) == '4' || input[i].charAt(j) == '7') {
                        tmp++;
                    }
                }
                if (tmp <= k) {
                    rs++;
                }
        }
        System.out.println(rs);
    }

}
