package contests.c.Apr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String[] input = io.readLine().split(" ");
        int[] slot = new int[3980];
        for (int i = 0; i < input.length; i++) {
            slot[Integer.valueOf(input[i])] = slot[Integer.valueOf(input[i])] + 1;
        }
        int rs = -1;
        for (int i = 0; i < slot.length; i++) {
            if (slot[i] == 1) {
                rs = i;
                break;
            }
        }
        System.out.println(rs);
    }
}
