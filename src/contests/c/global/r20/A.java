package contests.c.global.r20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String n = io.readLine();
            String[] input = io.readLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                if (input[i].equals("1")) {
                    if ((i & 1) == 0) {
                        rs.add("maomao90");
                    } else {
                        rs.add("errorgorn");
                    }
                }
            }
        }

        for (String string : rs) {
            System.out.println(string);
        }
    }
}
