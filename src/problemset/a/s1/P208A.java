package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P208A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        StringBuffer rs = new StringBuffer();
        while (input.contains("WUB")) {
            if (input.indexOf("WUB") == 0) {
                input = input.substring(3);
            } else if (input.indexOf("WUB") == input.length() - 3) {
                input = input.substring(0, input.indexOf("WUB"));
            } else {
                rs.append(input.substring(0, input.indexOf("WUB"))).append(" ");
                input = input.substring(input.indexOf("WUB") + 3);
            }
        }
        rs.append(input);
        System.out.println(rs.toString());
    }
}
