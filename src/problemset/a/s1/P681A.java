package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P681A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        String rs = "NO";
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            if (Integer.valueOf(input[1]).compareTo(2400) >= 0 && Integer.valueOf(input[1]).compareTo(Integer.valueOf(input[2])) < 0) {
                rs = "YES";
            }
        }
        System.out.println(rs);
    }

}
