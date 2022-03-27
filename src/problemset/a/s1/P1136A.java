package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1136A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        Integer rs = 0;
        int[] last = new int[cnt];
        int i = 0;
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            last[i++] = Integer.valueOf(input[1]);
        }
        Integer mark = Integer.valueOf(io.readLine());
        for (int j = 0; j < last.length; j++) {
            if (last[j] >= mark) {
                rs = j;
                break;
            }
        }
        System.out.println(last.length - rs);
    }

}
