package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1281A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            if (input.lastIndexOf("po") == input.length() - 2) {
                rs.add("FILIPINO");
            } else if (input.lastIndexOf("desu") == input.length() - 4 || input.lastIndexOf("masu") == input.length() - 4) {
                rs.add("JAPANESE");
            } else if (input.lastIndexOf("mnida") == input.length() - 5) {
                rs.add("KOREAN");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
