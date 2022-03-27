package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P900A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        Integer rs = 0;
        Integer idx = cnt;
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            if (Integer.valueOf(input[0]).compareTo(0) > 0) {
                rs++;
            }
        }
        if (rs.equals(1) || rs.equals(idx) || rs.equals(0)) {
            System.out.println("YES");
        } else if (rs + 1 - idx == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
