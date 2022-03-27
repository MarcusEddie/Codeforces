package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P381A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        Integer sereja = 0;
        Integer dima = 0;
        String[] input = br.readLine().split(" ");
        

        int sign = 1;
        int i = 0;
        int j = input.length - 1;
        while (i <= j) {
            Integer tmp = 0;
            if (Integer.valueOf(input[i]).compareTo(Integer.valueOf(input[j])) > 0) {
                tmp = Integer.valueOf(input[i]);
                i++;
            } else {
                tmp = Integer.valueOf(input[j]);
                j--;
            }
            if (sign > 0) {
                sereja = sereja + tmp;
                sign = -sign;
            } else {
                dima = dima + tmp;
                sign = -sign;
            }
        }
        System.out.println(String.valueOf(sereja) + " " + String.valueOf(dima));
    }
}
