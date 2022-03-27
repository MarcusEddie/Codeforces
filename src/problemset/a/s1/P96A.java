package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P96A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        int tmp = 1;
        int max = 0;
        for(int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                tmp++;
                if (tmp >=7) {
                    max = tmp;
                }
            } else {
                tmp = 1;
            }
        }
        if (max >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
