package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P710A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        Integer rs = 8;
        
        if((input.charAt(0) == 'a' || input.charAt(0) == 'h')) {
            rs = rs - 3;
        }
        if (input.charAt(1) == '1' || input.charAt(1) == '8') {
            rs = rs - 3;
        }
        if (input.equals("a1") || input.equals("a8") || input.equals("h1") || input.equals("h8")) {
            rs = rs +1;
        }
        System.out.println(rs);
    }

}
