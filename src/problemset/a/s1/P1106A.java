package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1106A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        int[][] matrix = new int[n][n];
        int idx = 0;
        while (n > 0) {
            n--;
            String input = io.readLine();
            for(int i = 0; i< input.length();i++) {
                if (input.charAt(i) == 'X') {
                    matrix[idx][i] = 1;
                } else {
                    matrix[idx][i] = 0;
                }
            }
            idx++;
        }
        if (matrix.length <= 2) {
            System.out.println(0);
        } else {
            Integer rs = 0;
            for(int i = 1; i < matrix.length - 1; i++) {
                for (int j = 1; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] == 1 && matrix[i - 1][j - 1] == 1 && matrix[i - 1][j + 1] == 1 && matrix[i + 1][j - 1] == 1 && matrix[i + 1][j + 1] == 1) {
                        rs++;
                    }
                }
            }
            System.out.println(rs);
        }
    }

}
