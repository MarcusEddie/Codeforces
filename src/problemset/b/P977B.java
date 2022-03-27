package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P977B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String input = io.readLine();
        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer max = 0;
        String rs = "";
        for(int i = 0; i<input.length() - 1; i++) {
            String tmp = String.valueOf(input.charAt(i)) + String.valueOf(input.charAt(i + 1));
            if (map.containsKey(tmp)) {
                Integer tmep = map.get(tmp);
                map.put(tmp, tmep + 1);
                if (max < tmep + 1) {
                    max = tmep + 1;
                    rs = tmp;
                }
            } else {
                map.put(tmp, 1);
            }
        }
        if (rs.length() == 0) {
            rs = input.substring(0, 2);
        }
        System.out.println(rs);
    }
}
