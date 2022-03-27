package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1104A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        int divider = 9;
        
        while (n > 0) {
            if (n % divider != 0) {
                divider--;
            } else {
                rs.add(divider);
                n = n - divider;
            }
        }
        System.out.println(rs.size());
        for (Integer integer : rs) {
            System.out.print(integer + " ");
        }
    }
}
