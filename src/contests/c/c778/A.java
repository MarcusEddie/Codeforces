package contests.c.c778;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Long> rs = new ArrayList<Long>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            List<Long> tmp = new ArrayList<Long>();
            for (int i = 0; i < input.length; i++) {
                tmp.add(Long.valueOf(input[i]));
            }
            Collections.sort(tmp);
            Long temp = tmp.get(tmp.size() - 2) + tmp.get(tmp.size() - 1);
            rs.add(temp);
        }
        
        for (Long long1 : rs) {
            System.out.println(long1);
        }
    }
}
