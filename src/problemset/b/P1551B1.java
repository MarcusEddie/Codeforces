package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class P1551B1 {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            if (input.length() == 1) {
                rs.add(0);
            } else {
                Map<String, Integer> map = new HashMap<String, Integer>();
                for(int i = 0; i <input.length(); i++) {
                    if(map.containsKey(String.valueOf(input.charAt(i)))) {
                        Integer tmp = map.get(String.valueOf(input.charAt(i)));
                        map.put(String.valueOf(input.charAt(i)), tmp+1);
                    } else {
                        map.put(String.valueOf(input.charAt(i)), 1);
                    }
                }
                Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
                Integer tmp = 0;
                Integer single = 0;
                while (it.hasNext()) {
                    Map.Entry<java.lang.String,java.lang.Integer> entry = (Map.Entry<java.lang.String,java.lang.Integer>) it
                            .next();
                    if (entry.getValue().equals(1)) {
                        
                        single++;
                    } else {
                        tmp++;
                    }
                }
                tmp = tmp + single / 2;
                rs.add(tmp);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
