package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P448A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] cupInput = io.readLine().split(" ");
        String[] medalInput = io.readLine().split(" ");
        Integer n = Integer.valueOf(io.readLine());
        Integer nc = 0;
        if (!(cupInput[0].equals("0") && cupInput[1].equals("0") && cupInput[2].equals("0"))) {
            Integer tmp = Integer.valueOf(cupInput[0]) + Integer.valueOf(cupInput[1]) + Integer.valueOf(cupInput[2]);
            if(tmp % 5 == 0) {
                nc = tmp / 5;
            } else {
                nc = tmp / 5;
                nc++;
            }
        }
        Integer nm = 0;
        if (!(medalInput[0].equals("0") && medalInput[1].equals("0") && medalInput[2].equals("0"))) {
            Integer tmp = Integer.valueOf(medalInput[0]) + Integer.valueOf(medalInput[1]) + Integer.valueOf(medalInput[2]);
            if(tmp % 10 == 0) {
                nm = tmp / 10;
            } else {
                nm = tmp / 10;
                nc++;
            }
        }
        if (n >= nc + nm) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
