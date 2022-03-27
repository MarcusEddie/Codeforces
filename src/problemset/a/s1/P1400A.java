package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1400A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            rs.add(check(input, len));
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
    
    private static String check(String input, Integer len) {
        StringBuffer rs = new StringBuffer();
        if (input.length() == 1) {
            return input;
        }
        if (len.equals(1)) {
            if (input.indexOf("1") < 0) {
                return "0";
            }
            if (input.indexOf("0") < 0) {
                return "1";
            }
        }
        rs.append(input.substring(0, len));
        for(int i = 1; i <= input.length() - len; i++) {
            boolean flag = false;
            String tmp = input.substring(i, i + len);
            for(int j = 0; j< rs.length(); j++) {
                if (rs.charAt(j) == tmp.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                rs.replace(0, 1, String.valueOf(input.charAt(i)));
            }
        }
        return rs.toString();
    }

}
