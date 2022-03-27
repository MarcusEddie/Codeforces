package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P912A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = io.readLine().split(" ");
        Long a = Long.valueOf(ab[0]);
        Long b = Long.valueOf(ab[1]);
        String[] xyz = io.readLine().split(" ");
        Long x = Long.valueOf(xyz[0]);
        Long y = Long.valueOf(xyz[1]);
        Long z = Long.valueOf(xyz[2]);
        Long rs = 0L;
        if (a - x - x - y < 0) {
            rs = x + x + y- a;
        }
        if (b - y - z - z - z < 0) {
            rs = rs + y + z + z + z - b;
        }
        System.out.println(rs);
    }

}
