package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P802G {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        int rs = 0;
        for(int i = 0; i< input.length(); i++) {
            if (input.charAt(i) == 'h' && rs == 0) {
                rs++;
            }
            if (input.charAt(i) == 'e' && rs == 1) {
                rs++;
            }
            if (input.charAt(i) == 'i' && rs == 2) {
                rs++;
            }
            if (input.charAt(i) == 'd' && rs == 3) {
                rs++;
            }
            if (input.charAt(i) == 'i' && rs == 4) {
                rs++;
                break;
            }
        }
        if (rs == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
