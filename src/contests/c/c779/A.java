package contests.c.c779;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String input = io.readLine();
            Integer tmp = 0;
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) == '0' && input.charAt(i + 1) == '0') {
                    tmp = tmp + 2;
                }
            }
            for (int i = 0; i < input.length() - 2; i++) {
                if (input.charAt(i) == '0' && input.charAt(i + 1) == '1' && input.charAt(i + 2) == '0') {
                    tmp = tmp + 1;
                }
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
