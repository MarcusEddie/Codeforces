package contests.c.c782;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> list = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Integer n = Integer.valueOf(input[0]);
            Integer r = Integer.valueOf(input[1]);
            Integer b = Integer.valueOf(input[2]);
            StringBuilder builder = new StringBuilder();
            int len = r / (b +1);
            int remainder = r % (b +1);
            for (int i = 0; i <= b; i++) {
                for (int j = 0; j < len; j++) {
                    builder.append("R");
                }
                if (remainder != 0) {
                    builder.append("RB");
                    remainder--;
                } else {
                    if (i < b) {
                        builder.append("B");
                    }
                }
            }
            list.add(builder.toString());
        }
        for (String string : list) {
            System.out.println(string);
        }
    }
}
