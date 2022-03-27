package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/141/A
 */
public class P141A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String finalStr = br.readLine();
        
        int[] input = new int[26];
        int[] output = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            int idx = str1.charAt(i) - 65;
            int tmp = input[idx];
            input[idx] = tmp + 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            int idx = str2.charAt(i) - 65;
            int tmp = input[idx];
            input[idx] = tmp + 1;
        }
        for (int i = 0; i < finalStr.length(); i++) {
            int idx = finalStr.charAt(i) - 65;
            int tmp = output[idx];
            output[idx] = tmp + 1;
        }
        String rs = "YES";
        for (int i = 0; i < output.length; i++) {
            if (input[i] != output[i]) {
                rs = "NO";
                break;
            }
        }
        System.out.println(rs);
    }
}
