package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P595A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        Integer n = Integer.valueOf(nm[0]);
        Integer m = Integer.valueOf(nm[1]);
        Integer rs = 0;
        while (n > 0) {
            n--;
            String[] input = io.readLine().split(" ");
            for (int i = 0; i < input.length; i= i +2) {
                if (input[i].equals("1") || input[i + 1].equals("1")) {
                    rs++;
                }
            }
        }
        System.out.println(rs);
    }

}
