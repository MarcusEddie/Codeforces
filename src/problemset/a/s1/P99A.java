package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P99A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        String integer = input.substring(0, input.indexOf("."));
        String frac = input.substring(input.indexOf(".") + 1, input.indexOf(".") + 2 );
        Integer rdigit = Integer.valueOf(String.valueOf(integer.charAt(integer.length() - 1)));
        Integer lfrac = Integer.valueOf(String.valueOf(frac.charAt(0)));
        if (rdigit.equals(9)) {
            System.out.println("GOTO Vasilisa.");
        } else {
            if (lfrac.compareTo(5) >=0) {
                rdigit++;
            }
            if (rdigit == 10) {
                System.out.println("GOTO Vasilisa.");
            } else {
                if (integer.length() < 2) {
                    System.out.println(rdigit);
                } else {
                    System.out.println(integer.substring(0, integer.length() - 1) + rdigit.toString());
                }
            }
        }
    }

}
