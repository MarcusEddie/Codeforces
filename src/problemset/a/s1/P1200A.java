package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1200A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        String input = io.readLine();
        int cursor = 0;
        int[] rooms = new int[10];
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'L') {
                for (int j = 0; j < rooms.length; j++) {
                    if(rooms[j] != 1) {
                        rooms[j] = 1;
                        break;
                    }
                }
            } else if (input.charAt(i) == 'R') {
                for(int j = rooms.length -1; j >= 0; j--) {
                    if (rooms[j] != 1) {
                        rooms[j] = 1;
                        break;
                    }
                }
            } else {
                rooms[Integer.valueOf(String.valueOf(input.charAt(i)))] = 0;
            }
        }
        
        StringBuffer rs = new StringBuffer();
        for (int i = 0; i < rooms.length; i++) {
            rs.append(rooms[i]);
        }
        System.out.println(rs.toString());
    }

}
