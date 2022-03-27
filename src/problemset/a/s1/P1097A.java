package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/1097/A
 */
public class P1097A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String card = br.readLine();
        String[] input = br.readLine().split(" ");
        boolean flag = false;
        for (int i = 0; i < input.length; i++) {
            String tmp = input[i];
            if (card.indexOf(String.valueOf(tmp.charAt(0))) == 0) {
                flag = true;
                break;
                
            }
            if (card.indexOf(String.valueOf(tmp.charAt(1))) == 1) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
