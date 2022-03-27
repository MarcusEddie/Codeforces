package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/151/A
 * @param args
 * @throws IOException
 */
public class P151A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Integer n = Integer.valueOf(inputs[0]);
        Integer k = Integer.valueOf(inputs[1]);
        Integer l = Integer.valueOf(inputs[2]);
        Integer c = Integer.valueOf(inputs[3]);
        Integer d = Integer.valueOf(inputs[4]);
        Integer p = Integer.valueOf(inputs[5]);
        Integer nl = Integer.valueOf(inputs[6]);
        Integer np = Integer.valueOf(inputs[7]);
        Integer rs1 = ((k * l) / nl) / n;
        Integer rs2 = (c * d) / n;
        Integer rs3 = (p / np) / n;
        Integer min = rs1;
        if (rs2 < min) {
            min = rs2;
        }
        if (rs3 <min) {
            min = rs3;
        }
        System.out.println(min);
    }
}
