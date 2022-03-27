package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class P987A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        Map<String, String> c2n = new HashMap<String, String>();
        c2n.put("purple", "Power");
        c2n.put("green", "Time");
        c2n.put("blue", "Space");
        c2n.put("orange", "Soul");
        c2n.put("red", "Reality");
        c2n.put("yellow", "Mind");
        while (cnt > 0) {
            cnt--;
            c2n.remove(io.readLine());
        }
        System.out.println(c2n.size());
        Iterator<Entry<String, String>> it = c2n.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) it
                    .next();
            System.out.println(entry.getValue());
            
        }
    }

}
