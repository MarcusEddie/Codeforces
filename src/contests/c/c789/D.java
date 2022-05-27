package contests.c.c789;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class D {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int leftZero = -1;
            int rightZero = -1;
            int negCnt = 0;
            int leftNeg = -1;
            int rightNeg = -1;
            int leftRemove = 0;
            int righRemove = 0;
            int product = 1;
            for (int i = 0; i < input.length; i++) {
                product = product * Integer.valueOf(input[i]);
                if ((i <= n / 2) && input[i].equals("0")) {
                    leftZero = i;
                    leftRemove = i + 1;
                }else if ((i > n / 2) && input[i].equals("0")) {
                    rightZero = i;
                    righRemove = n - i;
                }
                if (input[i].contains("-")) {
                    negCnt++;
                }
                if (leftNeg == -1 && input[i].contains("-")) {
                    leftNeg = i;
                } else if (leftNeg != -1 && input[i].contains("-")) {
                    rightNeg = i;
                }
            }
            if (product == 1) {
                rs.add(n + " 0");
                continue;
            }
            if (leftZero == -1 && rightZero == -1) {
                if (negCnt == 0 || ((negCnt & 1) == 0)) {
                    rs.add("0 0");
                } else if (negCnt == 1) {
                    if (1 * Integer.valueOf(input[leftNeg]) == product) {
                        rs.add(n +" 0");
                    } else {
                        if ((leftNeg+1) * 2 <= n) {
                            rs.add(String.valueOf(leftNeg + 1) + " 0");
                        } else {
                            rs.add("0 " + String.valueOf(n - leftNeg ));
                        }
                    }
                } else {
                    if (Integer.valueOf(input[leftNeg]).compareTo(Integer.valueOf(input[rightNeg])) >= 0) {
                        if (1 * Integer.valueOf(input[leftNeg]) == product) {
                            rs.add("0 " + n);
                        } else {
                            rs.add(String.valueOf(leftNeg + 1) + " 0");
                        }
                    } else {
                        if (1 * Integer.valueOf(input[rightNeg]) == product) {
                            rs.add("0 " + n);
                        } else {
                            rs.add("0 " + String.valueOf(n - rightNeg ));
                        }
                    }
                }
            } else {
                negCnt = 0;
                leftNeg = -1;
                rightNeg = -1;
                product = 1;
                for (int i = leftRemove; i < n - righRemove; i++) {
                    product = product * Integer.valueOf(input[i]);
                    if (input[i].contains("-")) {
                        negCnt++;
                    }
                    if (leftNeg == -1 && input[i].contains("-")) {
                        leftNeg = i;
                    } else if (leftNeg != -1 && input[i].contains("-")) {
                        rightNeg = i;
                    }
                }
                if (product == 1) {
                    rs.add(n + " 0");
                    continue;
                }
                if (negCnt == 0 || ((negCnt & 1) == 0)) {
                    rs.add(String.valueOf(leftRemove) + " " + String.valueOf(righRemove));
                } else if (negCnt == 1) {
                    if (1 * Integer.valueOf(input[leftNeg]) == product) {
                        rs.add(n +" 0");
                    } else {
                        if ((leftNeg+1) * 2 <= n) {
                            rs.add(String.valueOf(leftNeg + leftRemove + 1) + " " + righRemove);
                        } else {
                            rs.add(leftRemove + String.valueOf(n - leftNeg + righRemove));
                        }
                    }
                } else {
                    if (Integer.valueOf(input[leftNeg]).compareTo(Integer.valueOf(input[rightNeg])) >= 0) {
                        if (1 * Integer.valueOf(input[leftNeg]) == product) {
                            rs.add("0 " + n);
                        } else {
                            rs.add(String.valueOf(leftNeg + leftRemove + 1) + " " + righRemove);
                        }
                    } else {
                        if (1 * Integer.valueOf(input[rightNeg]) == product) {
                            rs.add("0 " + n);
                        } else {
                            rs.add(leftRemove + " " + String.valueOf(n - rightNeg + righRemove));
                        }
                    }
                }
                
                
            }
            
        }
        
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
