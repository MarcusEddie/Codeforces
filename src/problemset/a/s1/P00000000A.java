package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.io.IOException;

public class P00000000A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = io.readLine().split(" ");
        Integer n = Integer.valueOf(nm[0]);
        Integer m = Integer.valueOf(nm[1]);
        Set<Double> set = new HashSet<Double>();
        set.add(1d);
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 2; i <= n;i++) {
            set.add(Double.valueOf(i));
            for (int j = 2; j <=m;j++) {
                set.add(Math.pow(i, j));
            }
        }
        System.out.println(set.size());
    }
}
