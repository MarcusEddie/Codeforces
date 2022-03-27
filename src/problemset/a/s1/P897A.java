package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P897A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        Integer m = Integer.valueOf(nm[1]);
        String str = io.readLine();
        while (m > 0) {
            m--;
            String[] input = io.readLine().split(" ");
            Integer l = Integer.valueOf(input[0]) - 1;
            Integer r = Integer.valueOf(input[1]) - 1;
            StringBuffer tmp = new StringBuffer();
            for(int i = 0; i < str.length(); i++) {
                if (i >= l  && i <= r) {
                    if (String.valueOf(str.charAt(i)).equals(input[2])) {
                        tmp.append(input[3]);
                    } else {
                        tmp.append(String.valueOf(str.charAt(i)));
                    }
                }else {
                    tmp.append(String.valueOf(str.charAt(i)));
                }
            }
            str = tmp.toString();
        }
        System.out.println(str);
    }

}
