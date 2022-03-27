package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P202A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        int[] chars = new int[26];
        String input = io.readLine();
        for(int i = 0; i < input.length(); i++) {
            chars[input.charAt(i) - 97] = chars[input.charAt(i) - 97] + 1;
        }
        String rs = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != 0) {
                for(int j = 0; j < chars[i]; j++) {
                    rs = rs + String.valueOf((char)(i + 97));
                }
                break;
            }
        }
        System.out.println(rs);
        
    }

}
