package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P978B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String input = io.readLine();
        Integer rs = 0;
        int idx = input.indexOf("xxx");
        while (idx >= 0) {
            input = input.substring(0, idx) + input.substring(idx + 1);
            idx = input.indexOf("xxx");
            rs++;
        }
        System.out.println(rs);
    }
}
