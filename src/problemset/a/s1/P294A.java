package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P294A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer lines = Integer.valueOf(io.readLine());
        String[] initBird = io.readLine().split(" ");
        int[] birds = new int[initBird.length];
        for (int i = 0; i < birds.length; i++) {
            birds[i] = Integer.valueOf(initBird[i]);
        }
        Integer cnt = Integer.valueOf(io.readLine());
        while (cnt > 0) {
            cnt--;
            String[] shot = io.readLine().split(" ");
            Integer n = Integer.valueOf(shot[0]);
            Integer x = Integer.valueOf(shot[1]);
            if (lines == 1) {
                birds[0] = 0;
            } else {
                if (n == 1) {
                    birds[1] = birds[1] + birds[0] - x;
                    birds[0] = 0;
                } else if (n == lines) {
                    birds[n - 2] = birds[n - 2] + x - 1;
                    birds[n - 1] = 0;
                } else {
                    birds[n - 2] = birds[n - 2] + x - 1;
                    birds[n] = birds[n] + birds[n - 1] - x;
                    birds[n - 1] = 0;
                }
            }
        }
        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
        }
    }

}
