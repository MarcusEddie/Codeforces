package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1634A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] nk = io.readLine().split(" ");
            Integer k = Integer.valueOf(nk[1]);
            StringBuffer input = new StringBuffer(io.readLine());
            Set<StringBuffer> set = new HashSet<StringBuffer>();
            List<StringBuffer> list = new ArrayList<StringBuffer>();
            list.add(input);
            if (input.length() == 1 || k.equals(0)) {
                rs.add(1);
            } else {
                StringBuffer ori = new StringBuffer(input);
                StringBuffer tmp = new StringBuffer(input);
                StringBuffer rev = tmp.reverse();
                if (equals(rev, ori)) {
                    rs.add(1);   
                } else {
                    rs.add(2);
                }
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
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
