package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P38A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer ranks = Integer.valueOf(io.readLine());
        String[] years = io.readLine().split(" ");
        String[] ab = io.readLine().split(" ");
        Integer a = Integer.valueOf(ab[0]);
        Integer b = Integer.valueOf(ab[1]);
        Integer rs = 0;
        for(int i = a - 1; i < b - 1;i++) {
            rs = Integer.valueOf(years[i]) + rs;
        }
        System.out.println(rs);
    }
}
