package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1143A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        Integer rs = 0;
        if (input[input.length - 1].equals("0")) {
            for(int i = input.length - 1; i >= 0; i--) {
                if (input[i].equals("1")) {
                    rs = i + 1;
                    break;
                }
            }
        } else {
            for(int i = input.length - 1; i >= 0; i--) {
                if (input[i].equals("0")) {
                    rs = i + 1;
                    break;
                }
            }
        }
        System.out.println(rs);
    }
}
