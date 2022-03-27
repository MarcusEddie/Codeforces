package contests.codeTON.c1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] nk = io.readLine().split(" ");
            Integer k = Integer.valueOf(nk[1]);
            String[] input = io.readLine().split(" ");
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < input.length; i++) {
                tmp.add(Integer.valueOf(input[i]));
            }
            Collections.sort(tmp);
            while (tmp.size() != 2) {
                Integer temp = tmp.remove(0);
                List<Integer> tmp2 = new ArrayList<Integer>();
                boolean flag = false;
                if (temp.equals(0)) {
                    flag = true;
                    temp = tmp.remove(0);
                }
                for (Integer integer : tmp) {
                    tmp2.add(integer - temp);
                }
                tmp.clear();
                tmp.addAll(tmp2);
                if (flag) {
                    tmp.add(0 - temp);
                }
                Collections.sort(tmp);
            }
//            System.out.println(tmp.toString());
            Integer diff = tmp.get(1) - tmp.get(0);
            if (diff.equals(k)) {
                rs.add("YES");
            } else {
                rs.add("NO");
            }
        }   
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
