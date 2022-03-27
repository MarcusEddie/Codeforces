package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1585A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int die = 0;
            int height = 1;
            for (int i = 0; i < input.length; i++) {
                if (i>= 1 && input[i].equals("0") && input[i - 1].equals("0")) {
                    die = 1;
                    break;
                }else if (input[i].equals("1") && i >= 1 && input[i - 1].equals("1")) {
                    height = height + 5;
                } else if (input[i].equals("1")) {
                    height++;
                }
            }
            if (die == 1) {
                rs.add(-1);
            } else {
                rs.add(height);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
