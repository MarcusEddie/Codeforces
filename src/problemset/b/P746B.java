package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TimeZone;

public class P746B {

    public static void main(String[] args) throws IOException{
//        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
//        Integer len = Integer.valueOf(io.readLine());
//        String input = io.readLine();
//        StringBuilder rs = new StringBuilder();
//        rs.append(input.charAt(input.length() - 1));
//        for(int i = input.length() - 2; i >= 0; i--) {
//            int tmp = (rs.length() + 1) / 2;
//            if (rs.length() % 2 == 1) {
//                tmp--;
//            }
//            rs.insert(tmp, String.valueOf(input.charAt(i)));
//        }
//        System.out.println(rs.toString());
        String tmp = "UTC";
        System.out.println(TimeZone.getTimeZone(tmp));
    }
}
