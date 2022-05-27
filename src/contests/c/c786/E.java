package contests.c.c786;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            io.readLine();
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            Set<Integer> row = new HashSet<Integer>();
            Set<Integer> col = new HashSet<Integer>();
            List<String> matrix = new ArrayList<String>();
            int total = 0;
            for (int i = 0; i < n; i++) {
                String input = io.readLine();
                matrix.add(input);
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == '1') {
                        row.add(i);
                        total++;
                        col.add(j);
                    }
                }
            }
            int counter = 0;
            if (row.size() != n) {
                counter = n - row.size();
            }
//            System.out.println(row.toString());
            if (col.size() != n) {
                if (n - col.size() > counter) {
                    counter = n - col.size();
                }
            }
//            System.out.println(col.toString());
//            System.out.println(counter);
//            System.out.println(total);
            if (row.size() == n && col.size() == n) {
                rs.add(total - n);
            } else {
                rs.add(counter + total - (n - counter));
            }
        }
//        System.out.println("--");
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
