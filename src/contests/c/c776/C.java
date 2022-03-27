package contests.c.c776;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] nm = io.readLine().split(" ");
            Integer n = Integer.valueOf(nm[0]);
            Integer m = Integer.valueOf(nm[1]);
            List<Integer> w = new ArrayList<Integer>();
            Map<Integer, Long> map = new HashMap<Integer, Long>();
            
            for(int i = 0; i<= m; i++) {
                String[] tmp = io.readLine().split(" ");
                w.add(Integer.valueOf(tmp[1]));
                map.put(Integer.valueOf(tmp[1]), Long.valueOf(tmp[0]));
            }
            Collections.sort(w);
            
        }
    }

}
