package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1005A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        List<String> rs = new ArrayList<String>();
        Integer cnt = 0;
        for (int i = 0; i < input.length; i++) {
            if (i + 1< input.length && input[i + 1].equals("1")) {
                rs.add(input[i]);
            }else if (i + 1 >= input.length) {
                rs.add(input[i]);
            }
        }
        System.out.println(rs.size());
        String str = "";
        for (String string : rs) {
            str = str + " " + string;
        }
        System.out.println(str.substring(1));
    }

}
