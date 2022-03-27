package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1491A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = io.readLine().split(" ");
        Integer n = Integer.valueOf(nq[0]);
        Integer q = Integer.valueOf(nq[1]);
        String[] input = io.readLine().split(" ");
        List<Integer> rs = new ArrayList<Integer>();
        Integer len = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("1")) {
                len++;
            }
        }
        while (q > 0) {
            q--;
            String[] query = io.readLine().split(" ");
            if (query[0].equals("1")) {
                String tmp = String.valueOf(1 - Integer.valueOf(input[Integer.valueOf(query[1]) - 1]));
                input[Integer.valueOf(query[1]) - 1] = tmp;
                if (tmp.equals("1")) {
                    len++;
                } else {
                    len--;
                }
            } else {
                if (len.compareTo(Integer.valueOf(query[1])) >= 0) {
                    rs.add(1);
                } else {
                    rs.add(0);
                }
            }
        }
        
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
