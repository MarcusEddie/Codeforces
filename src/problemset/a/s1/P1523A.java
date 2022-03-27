package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1523A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] nm = io.readLine().split(" ");
            Integer m = Integer.valueOf(nm[1]);
            String input = io.readLine();
            int[] arr = new int[input.length()];
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(String.valueOf(input.charAt(i)));
                if (arr[i] == 1) {
                    set.add(i);
                }
            }
            while (m > 0) {
                Set<Integer> tmp = new HashSet<Integer>();
                m--;
                boolean flag = false;
                for (int i = 0; i < arr.length; i++) {
                    if (i == 0 && arr[i] == 0 && arr[i+1] ==1 && set.contains(i + 1)) {
                        flag = true;
                        arr[i] = 1;
                        tmp.add(i);
                        tmp.add(i + 1);
                    } else if (i == arr.length - 1 && arr[i] == 0 && arr[i - 1] == 1 && set.contains(i - 1)) {
                        flag = true;
                        arr[i] = 1;
                        tmp.add(i);
                        tmp.add(i - 1);
                    }else if (i != 0 && i != arr.length - 1 ) {
                        if (arr[i] == 0 && arr[i - 1] == 1 && (arr[i + 1] != 1 || arr[i+1] == 1 && !set.contains(i + 1))&& set.contains(i - 1)) {
                            flag = true;
                            arr[i] = 1;
                            tmp.add(i);
                            tmp.add(i - 1);
                        } else if (arr[i] == 0 && (arr[i-1]!= 1 || arr[i - 1] == 1 && !set.contains(i - 1))&& arr[i+1] == 1 && set.contains(i + 1)) {
                            flag = true;
                            tmp.add(i + 1);
                            arr[i] = 1;
                            tmp.add(i);

                        }
                    }
                }
                System.out.println(set.toString());
                set.clear();
                set.addAll(tmp);
                System.out.println(set.toString());

                StringBuffer tmp2 = new StringBuffer();
                for (int i = 0; i < arr.length; i++) {
                    tmp2.append(arr[i]);
                }
                System.out.println(tmp2.toString());
                if (!flag) {
                    break;
                }
            }
            StringBuffer tmp = new StringBuffer();
            for (int i = 0; i < arr.length; i++) {
                tmp.append(arr[i]);
            }
            rs.add(tmp.toString());
        }
        
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
