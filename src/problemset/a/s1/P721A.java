package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P721A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String input = io.readLine();
        Integer rs = 0;
        Integer cnt = 0;
        Boolean flag = false;
        List<Integer> rs2 = new ArrayList<Integer>();
        for(int i = 0; i < input.length(); i++) {
            if (!flag && input.charAt(i) == 'B') {
                flag = true;
                rs++;
                cnt++;
            } else if (input.charAt(i) == 'B') {
                cnt++;
            }else if (input.charAt(i) == 'W') {
                flag = false;
            }
            if (!flag && cnt > 0) {
                rs2.add(cnt);
                cnt = 0;
            } else if (flag && i == input.length() - 1) {
                rs2.add(cnt);
            }
        }
        String str = "";
        for (Integer integer : rs2) {
            str = str + " " + integer.toString();
        }
        System.out.println(rs);
        if (rs != 0) {
            System.out.println(str.substring(1));
        }
    }
}
