package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P867A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String input = io.readLine();
        Integer rs = 0;
        Integer idx = 0;
        for(int i =0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'S' && input.charAt(i + 1) == 'F') {
                rs++;
            }
            if (input.charAt(i) == 'F' && input.charAt(i + 1) == 'S') {
                idx++;
            }
        }
        if (rs.compareTo(idx) > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
