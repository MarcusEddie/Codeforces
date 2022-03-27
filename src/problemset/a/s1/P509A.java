package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/509/A
 */
public class P509A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        if (cnt.compareTo(1) == 0) {
            System.out.println(1);
        } else {
            int[][] input = new int[cnt][cnt];
            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input[i].length; j++) {
                    if (i == 0) {
                        input[i][j] = 1;
                    } else if (j == 0) {
                        input[i][j] = 1;
                    } else {
                        
                    input[i][j] = 0;
                    }
                }
            }
            for (int i = 1; i < input.length; i++) {
                for (int j = 1; j < input[i].length; j++) {
                    if (input[i][j] == 0) {
                        input[i][j] = input[i][j - 1] + input[i - 1][j];
                        input[j][i] = input[i][j - 1] + input[i - 1][j];
                    }
                }
            }
            System.out.println(input[cnt - 1][cnt - 1]);
        }
    }
}
