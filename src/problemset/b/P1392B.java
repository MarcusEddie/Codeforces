package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1392/B
 */
public class P1392B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] nk = io.readLine().split(" ");
            Integer n = Integer.valueOf(nk[0]);
            Integer k = Integer.valueOf(String.valueOf(nk[1].charAt(nk[1].length() -1)));
            String[] input = io.readLine().split(" ");
            int[] arr = new int[input.length];
            Integer max = Integer.MIN_VALUE;
            Integer min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(input[i]);
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = max - arr[i];
            }
            max = max - min;
            if(k % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = max - arr[i];
                }
            }
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                tmp.append(" ").append(arr[i]);
            }
            rs.add(tmp.toString());
        }
        for (String string : rs) {
            System.out.println(string.substring(1));
        }
    }

}
