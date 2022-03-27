package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1481A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] xy = io.readLine().split(" ");
            Integer x = Integer.valueOf(xy[0]);
            Integer y = Integer.valueOf(xy[1]);
            String input = io.readLine();
            int[] direction = new int[4];
            for(int i = 0; i<input.length(); i++) {
                if (input.charAt(i) == 'U') {
                    direction[0] = direction[0] + 1;
                }else if (input.charAt(i) == 'D') {
                    direction[1] = direction[1] + 1;
                }else if (input.charAt(i) == 'R') {
                    direction[2] = direction[2] + 1;
                }else if (input.charAt(i) == 'L') {
                    direction[3] = direction[3] + 1;
                }
            }
            if (x.compareTo(0) > 0 && y.compareTo(0) >= 0) {
                if (direction[0] >= y && direction[2] >= x) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            } else if (x.compareTo(0) >= 0 && y.compareTo(0) < 0) {
                if (direction[1] >= -y && direction[2] >= x) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            }  else if (x.compareTo(0) < 0 && y.compareTo(0) <= 0) {
                if (direction[1] >= -y && direction[3] >= -x) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            }  else if (x.compareTo(0) <= 0 && y.compareTo(0) > 0) {
                if (direction[0] >= y && direction[3] >= -x) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            } 
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
