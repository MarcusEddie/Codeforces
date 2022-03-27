package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1316A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] nm = io.readLine().split(" ");
            Integer n = Integer.valueOf(nm[0]);
            Integer m = Integer.valueOf(nm[1]);
            String[] input = io.readLine().split(" ");
            Integer sum = 0;
            for (int i = 0; i < input.length; i++) {
                sum = sum + Integer.valueOf(input[i]);
            }
            if (sum.compareTo(m) <= 0) {
                rs.add(sum);
            } else {
                rs.add(m);
            }
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
