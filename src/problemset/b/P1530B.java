package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1530B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split(" ");
            Integer h = Integer.valueOf(input[0]);
            Integer w = Integer.valueOf(input[1]);
            StringBuffer tmp = new StringBuffer();
            int sign = 1;
            StringBuffer r1 = new StringBuffer();
            if (w % 2 == 0) {
                for(int i = 0; i < h; i++) {
                    StringBuffer r = new StringBuffer();
                    for(int j = 0; j < w; j++) {
                        if (i == 0 && sign == 1) {
                            r1.append("1");
                            sign = -sign;
                        } else if (i == 0 && sign == -1){
                            r1.append("0");
                            sign = -sign;
                        } else if (i != h - 1 && (i % 2 == 1) && j != w -1) {
                            r.append("0");
                        } else if (i != h - 1 && (i % 2 == 1) && j == w -1) {
                            r.append("1");
                        } else if (i != h - 1 && (i % 2 == 0) && j != 0) {
                            r.append("0");
                        } else if (i != h - 1 && (i % 2 == 0) && j == 0) {
                            r.append("1");
                        }
                    }
                    if (i == 0) {
                        tmp.append(r1).append("\n");
                    } else if (i == h -1) {
                        if ((h - 2) % 2 == 0) {
                            tmp.append(r1.reverse()).append("\n");
                        } else {
                            tmp.append(r1).append("\n");
                        }
                    } else {
                        tmp.append(r).append("\n");
                    }
                }
            }else {
                for(int i = 0; i < h; i++) {
                    StringBuffer r = new StringBuffer();
                    for(int j = 0; j < w; j++) {
                        if (i == 0 && sign == 1) {
                            r1.append("1");
                            sign = -sign;
                        } else if (i == 0 && sign == -1){
                            r1.append("0");
                            sign = -sign;
                        } else if (i != h - 1 && (i % 2 == 0) && (j == 0 || j == w -1)) {
                            r.append("1");
                        } else if (i != h - 1 && (i % 2 == 0) && (j != 0 && j != w -1)) {
                            r.append("0");
                        } else if (i != h - 1 && (i % 2 == 1)) {
                            r.append("0");
                        }
                    }
                    if (i == 0) {
                        tmp.append(r1).append("\n");
                    } else if (i == h -1) {
                        if ((h - 2) % 2 == 0) {
                            tmp.append(r1.reverse()).append("\n");
                        } else {
                            tmp.append(r1).append("\n");
                        }
                    } else {
                        tmp.append(r).append("\n");
                    }
                }
            }
            rs.add(tmp.toString());
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
