package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P831B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println((int)'a');
//        System.out.println((int)'z');
//        System.out.println((int)'A');
//        System.out.println((int)'Z');
        
        String first = io.readLine();
        String second = io.readLine();
        String input = io.readLine();
        StringBuffer rs = new StringBuffer();
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < first.length(); i++) {
            map.put(String.valueOf(first.charAt(i)), String.valueOf(second.charAt(i)));
        }
        for(int i = 0; i< input.length(); i++) {
            if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
                rs.append(map.get(String.valueOf(input.charAt(i))));
            } else if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                rs.append(map.get(String.valueOf(input.charAt(i)).toLowerCase()).toUpperCase());
            } else {
                rs.append(String.valueOf(input.charAt(i)));
            }
        }
        System.out.println(rs.toString());
        
    }
}
