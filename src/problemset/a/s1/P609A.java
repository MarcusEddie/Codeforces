package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P609A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        Integer m = Integer.valueOf(io.readLine());
        Integer rs = 0;
        List<Integer> vols = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            Integer tmp = Integer.valueOf(io.readLine());
            if (m <= tmp) {
                rs = 1;
            }
            vols.add(tmp);
        }
        if (rs ==1) {
            System.out.println(rs);
        } else {
            Collections.sort(vols);
            for(int i = vols.size() - 1; i >= 0; i--) {
                Integer tmp = vols.get(i);
                if (m > tmp) {
                    rs++;
                    m = m - tmp;
                } else {
                    rs++;
                    break;
                }
            }
            System.out.println(rs);
        }
    }
}
