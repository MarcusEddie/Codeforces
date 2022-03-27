package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1351A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            rs.add(Integer.valueOf(input[0]) + Integer.valueOf(input[1]));
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
