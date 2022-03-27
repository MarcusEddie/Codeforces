package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P78A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String s1 = io.readLine();
        String s2 = io.readLine();
        String s3 = io.readLine();
        int s1c =  0;
        int s2c = 0;
        int s3c = 0;
        for(int i = 0; i<s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                s1c++;
            }
        }
        if (s1c != 5) {
            System.out.println("NO");
        } else {
            for(int i = 0; i<s2.length(); i++) {
                if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
                    s2c++;
                }
            }
            if (s2c != 7) {
                System.out.println("NO");
            } else {
                for(int i = 0; i<s3.length(); i++) {
                    if (s3.charAt(i) == 'a' || s3.charAt(i) == 'e' || s3.charAt(i) == 'i' || s3.charAt(i) == 'o' || s3.charAt(i) == 'u') {
                        s3c++;
                    }
                }
                if (s3c != 5) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }

}
