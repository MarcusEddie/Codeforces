package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1552A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> rs = new ArrayList<Integer>();
        Integer cnt = Integer.valueOf(io.readLine());
        while (cnt  >0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            int[] chars = new int[26];
            for(int i = 0; i<input.length(); i++) {
                chars[input.charAt(i) - 97] = chars[input.charAt(i) - 97] + 1;
            }
            StringBuffer tmp = new StringBuffer();
            for (int i = 0; i < chars.length; i++) {
                while (chars[i] != 0) {
                    tmp.append(String.valueOf((char)(i + 97)));
                    chars[i] = chars[i] - 1;
                }
            }
            Integer counter = 0;
            for(int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != tmp.charAt(i)) {
                    counter++;
                }
            }
            rs.add(counter);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
