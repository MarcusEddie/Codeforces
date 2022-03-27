package contests.e.c124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        
        List<String> params = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            set.add(input);
            params.add(input);
        }
        for (String input : params) {
            String[] xy = input.split(" ");
            Integer x = Integer.valueOf(xy[0]);
            Integer y = Integer.valueOf(xy[1]);
            int i = 1;
            boolean flag = false;
            while(true) {
                List<String> temp = gen(x, y, i);
                for (int j = 0; j < temp.size(); j++) {
                    if (!set.contains(temp.get(j))) {
                        flag = true;
                        rs.add(temp.get(j));
                        break;
                    }
                }
                if (flag) {
                    break;
                }
                temp = gen1(x, y, i);
                i++;
                for (int j = 0; j < temp.size(); j++) {
                    if (!set.contains(temp.get(j))) {
                        flag = true;
                        rs.add(temp.get(j));
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        
        for (String string : rs) {
            System.out.println(string);
        }
    }
    
    private static List<String> gen(Integer x, Integer y, int j) {
        List<String> rs = new ArrayList<String>();
        int xr = x + j;
        int xl = x - j;
        int yu = y + j;
        int yd = y - j;
        Set<String> set = new HashSet<String>();
        set.add(String.valueOf(xr) + " " + String.valueOf(y));
        set.add(String.valueOf(xl) + " " + String.valueOf(y));
        set.add(String.valueOf(x) + " " + String.valueOf(yu));
        set.add(String.valueOf(x) + " " + String.valueOf(yd));
        rs.addAll(set);
        return rs;
    }
    
    private static List<String> gen1(Integer x, Integer y, int j) {
        List<String> rs = new ArrayList<String>();
        int xr = x + j;
        int xl = x - j;
        int yu = y + j;
        int yd = y - j;
        Set<String> set = new HashSet<String>();
        for(int i = 1; i<= j; i++) {
            set.add(String.valueOf(xr) + " " + String.valueOf(y + i));
            set.add(String.valueOf(xr) + " " + String.valueOf(y - i));
            set.add(String.valueOf(xl) + " " + String.valueOf(y + i));
            set.add(String.valueOf(xl) + " " + String.valueOf(y - i));
            set.add(String.valueOf(x + i) + " " + String.valueOf(yu));
            set.add(String.valueOf(x - i) + " " + String.valueOf(yu));
            set.add(String.valueOf(x + i) + " " + String.valueOf(yd));
            set.add(String.valueOf(x - i) + " " + String.valueOf(yd));
        }
        rs.addAll(set);
        return rs;
    }
}
