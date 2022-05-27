package contests.c.c786;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            Integer tmp = input.charAt(0) - 97;
            tmp *= 25;
            if (input.charAt(1) > input.charAt(0)) {
                tmp = tmp + input.charAt(1) - 97;
            } else {
                tmp = tmp + input.charAt(1) - 96;
            }
            rs.add(tmp);
        }
        for (Integer string : rs) {
            System.out.println(string);
        }
    }
}
