package contests.codeTON.c1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            Integer min = Integer.MAX_VALUE;
            Integer max = 0;
            int minIdx = 0;
            int maxIdx = 0;
            for (int i = 0; i < input.length; i++) {
                Integer tmp = Integer.valueOf(input[i]);
                if (min.compareTo(tmp) > 0) {
                    min = tmp;
                    minIdx = i + 1;
                }
                if (max.compareTo(tmp) < 0) {
                    max = tmp;
                    maxIdx = i + 1;
                }
            }
            rs.add(minIdx + " " + maxIdx);
        }
        
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
