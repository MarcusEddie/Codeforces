package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1144A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        List<String> rs = new ArrayList<String>();
        Integer cnt = Integer.valueOf(io.readLine());
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            Boolean flag = false;
            int[] tmp = new int[26];
            if (input.length() == 1) {
                rs.add("Yes");
            } else if (input.length() > 26) {
                rs.add("No");
            } else {
                Set<String> set = new HashSet<String>();
                
                for(int i = 0; i < input.length(); i++) {
                    int idx = input.charAt(i) - 97;
                    tmp[idx] = 1;
                    if (set.contains(String.valueOf(input.charAt(i)))) {
                        flag = true;
                        break;
                    } else {
                        set.add(String.valueOf(input.charAt(i)));
                    }
                }
                if (flag) {
                    rs.add("No");
                } else {
                    int i = 0;
                    int j = 25;
//                    for (int j2 = 0; j2 < tmp.length; j2++) {
//                        System.out.print(tmp[j2] + " ");
//                    }
//                    System.out.println();
                    boolean flagI = true;
                    boolean flagJ = true;
                    while(flagI || flagJ) {
                        if (tmp[i] == 1 && flagI) {
                            flagI = false;
                        } else if (flagI) {
                            i++;
                        }
                        if (tmp[j] == 1 && flagJ) {
                            flagJ = false;
                        } else if (flagJ) {
                            j--;
                        }
                    }
//                    System.out.println(i + " " + j);
                    for(int k = i; k <= j; k++) {
                        if (tmp[k] != 1) {
                            flag = true;
                            break;
                        }
                    }
                    
                    if (flag) {
                        rs.add("No");
                    } else {
                        rs.add("Yes");
                    }
                }
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
