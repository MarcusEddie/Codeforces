package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        int[] coins = {7,2,5};
         int amount = 27;
    }
//
//    /**
//     * @param coins:  a list of integer
//     * @param amount: a total amount of money amount
//     * @return: the fewest number of coins that you need to make up
//     */
//    public static int coinChange(int[] coins, int amount) {
//        int[] f = new int[amount + 1];
//        f[0] = 0;
//        for (int i = 1; i < f.length; i++) {
//            f[i] = Integer.MAX_VALUE;
//        }
//        List<Integer> minList = new ArrayList<Integer>();
//        for (int i = 0; i < coins.length; i++) {
//            for (int j = 0; j < f.length; j++) {
//                if (j - coins[i] >= 0 && (f[j - coins[i]] + 1 < f[j]) && f[j - coins[i]] != Integer.MAX_VALUE) {
//                    f[j] = f[j - coins[i]] + 1;
//                }
//            }
//            minList.add(f[amount]);
//        }
//        Collections.sort(minList);
//        return minList.get(0);
//    }
}
