package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P454A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        StringBuffer rs = new StringBuffer();
        for(int i =1; i <= n; i++) {
            if (i <= n / 2) {
                rs.append(gen(n, 1 + (i - 1) * 2)).append("\n");
            } else if (i == ((n/2) + 1)) {
                rs.append(gen(n, n)).append("\n");
            } else {
                rs.append(gen(n, 1 + (n - i) * 2)).append("\n");
            }
        }
        System.out.println(rs.toString());
    }
    
    private static String gen(Integer len, Integer cnt) {
        StringBuffer rs = new StringBuffer();
        for(int i =1; i <= len; i++) {
            if(i <=((len - cnt) / 2)) {
                rs.append("*");
            } else if (i > (cnt + ((len-cnt) / 2))) {
                rs.append("*");
            }else {
                rs.append("D");
            }
        }
        return rs.toString();
    }
}
