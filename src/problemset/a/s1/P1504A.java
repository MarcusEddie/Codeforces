package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1504A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            StringBuffer input = new StringBuffer(io.readLine());
            StringBuffer tmp = new StringBuffer(input).reverse();
            if (input.length() % 2 == 0) {
                StringBuffer tm = new StringBuffer(input).insert(input.length() / 2, "a");
                tmp = new StringBuffer(tm).reverse();
                if (!tm.toString().equals(tmp.toString())) {
                    rs.add("YES");
                    rs.add(tm.toString());
                } else {
                    boolean flag = false;
                    for( int i = input.length() - 1; i >= 0; i--) {
                        if (input.charAt(i) != 'a') {
                            rs.add("YES");
                            rs.add(new StringBuffer(input).insert(input.length() - 1 - i, "a").toString());
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        rs.add("NO");
                    }
                }
            } else {
                boolean flag = false;
                for( int i = input.length() - 1; i >= 0; i--) {
                    if (input.charAt(i) != 'a') {
                        rs.add("YES");
                        rs.add(new StringBuffer(input).insert(input.length() - 1 - i, "a").toString());
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    rs.add("NO");
                }
            }
//            int len = input.length() / 2;
//            
//                int idx = 0;
////                System.out.println(tmp);
//                StringBuffer tm = new StringBuffer(input).insert(idx, "a");
//                tmp = new StringBuffer(tm).reverse();
//                boolean flag = false;
//                while (true) {
//                    if (!tm.toString().equals(tmp.toString())) {
//                        flag = true;
//                        break;
//                    }
//                    idx++;
//                    if (idx >= input.length()) {
//                        break;
//                    }
//                    tm = new StringBuffer(input).insert(idx, "a");
//                    tmp = new StringBuffer(tm).reverse();
//                }
////                System.out.println(tm + " " + idx + " " + flag);
//                if (flag) {
//                    rs.add("YES");
//                    rs.add(tm.toString());
//                } else {
//                    rs.add("NO");
//                }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
    public static boolean equals(StringBuffer sb1, StringBuffer sb2){
        
        if(sb1 == sb2)
            return true;
        if(sb1 == null || sb2 == null)
            return false;
        
        boolean isEqual = true;
        if(sb1.length() == sb2.length()){
            for(int i = 0 ; i < sb1.length(); i++){
                
                if(sb1.charAt(i) != sb2.charAt(i)){
                    isEqual = false;
                    break;
                }
            }
        }else{
            isEqual = false;
        }
        
        return isEqual;
    }
}
