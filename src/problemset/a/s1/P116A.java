package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/116/A
 * @author ey
 *
 */
public class P116A {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer rs = 0;
        Integer stops = Integer.valueOf(br.readLine());
        Integer currentVol = 0;
        for(int i = 0; i < stops; i++) {
            String[] io = br.readLine().split(" ");
            Integer exit = Integer.valueOf(io[0]);
            Integer in = Integer.valueOf(io[1]);
            currentVol = currentVol - exit + in;
            if (rs < currentVol) {
                rs = currentVol;
            }
        }
        System.out.println(rs);
    }
}
