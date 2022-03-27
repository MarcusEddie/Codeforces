package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class P1307A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] nd = io.readLine().split(" ");
            Integer n = Integer.valueOf(nd[0]);
            Integer d = Integer.valueOf(nd[1]);
            String[] input = io.readLine().split(" ");
            if (input.length == 1) {
                rs.add(Integer.valueOf(input[0]));
            } else {
                Integer tmp =Integer.valueOf(input[0]);
                for (int i = 1; i < input.length; i++) {
                    if ((Integer.valueOf(input[i]) * i) <= d) {
                        tmp = tmp + Integer.valueOf(input[i]);
                        d = d - Integer.valueOf(input[i]) * i;
                    } else {
                        tmp = tmp + d / i;
                        break;
                    }
                }
                rs.add(tmp);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
// 8 2 1 3 3 3 8 10 4 5 4 8 7 7 3 3 10 10 5 1 9 10 4 3 4 2 8 6 4 3 1 4 5 2 10 2 1 2 3 10 2 10 3 3
// 9 1 1 3 3 3 8 10
//10 0 1 3 3 3 8 10
//10 1 0 3 3 3 8 10
//11 0 0 3 3 3 8
//11 0 1 2 3 3 8
//11 0 2 1 3 3 8
//11 0 3 0 3 3 8
//11 1 2 0 3 3 8
//11 2 1 0 3 3 8
//11 3 0 0 3 3 8
//12 2 0 0 3 3 8
//13 1 0 0 3 3 8
//14 0 0 0 3 3 8
//14 0 0 1 2 3 8
//14 0 1 0 2 3 8
//14 1 0 0 2 3 8
//15 0 0 0 2 3 8

// 1 0 3 2
// 1 1 2 0
// 1 2 1 0
// 1 3 0 2
// 2 2 0 2
// 3 1 0 2