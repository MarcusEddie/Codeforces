package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1440A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] nch = io.readLine().split(" ");
            Integer n = Integer.valueOf(nch[0]);
            Integer c0 = Integer.valueOf(nch[1]);
            Integer c1 = Integer.valueOf(nch[2]);
            Integer h = Integer.valueOf(nch[3]);
            String input = io.readLine();
            Integer tmp =0;
            if (((c0 == c1) && (c1 == h) && (c0 == h)) || ((c0 < h) && (c1 < h)) || ((c0 + h > c1) && (c1 + h) > c0)) {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '1') {
                        tmp = tmp + c1;
                    } else {
                        tmp = tmp + c0;
                    }
                }
            }else if (c0 + h < c1) {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '1') {
                        tmp = tmp + c0 + h;
                    } else {
                        tmp = tmp + c0;
                    }
                }
            } else if (c1 + h < c0)  {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '1') {
                        tmp = tmp + c1;
                    } else {
                        tmp = tmp + c1 + h;
                    }
                }
            }
            rs.add(tmp);
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
