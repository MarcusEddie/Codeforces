package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/703/A
 */
public class P703A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        Integer mishka = 0;
        Integer chris = 0;
        while (cnt > 0) {
            String[] input = br.readLine().split(" ");
            if (Integer.valueOf(input[0]) > Integer.valueOf(input[1])) {
                mishka++;
            } else if (Integer.valueOf(input[0]) < Integer.valueOf(input[1])) {
                chris++;
            }
            cnt--;
        }
        if (mishka > chris) {
            System.out.println("Mishka");
        } else if (mishka < chris) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
