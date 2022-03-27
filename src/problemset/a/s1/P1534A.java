package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1534A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;

            String[] nm = io.readLine().split(" ");
            Integer n = Integer.valueOf(nm[0]);
            Integer m = Integer.valueOf(nm[1]);
            String[][] matrix = new String[n][m];
            Boolean flag = false;
            Boolean flag2 = false;
            List<NodeP1534A> r = new ArrayList<NodeP1534A>();
            List<NodeP1534A> w = new ArrayList<NodeP1534A>();
            for (int i = 0; i < n; i++) {
                String input = io.readLine();
                int idxR = input.indexOf("R");
                int lIdxR = input.lastIndexOf("R");
                int idxW = input.indexOf("W");
                int lIdxW = input.lastIndexOf("W");
                if (idxR >= 0 && lIdxR >= 0 && lIdxR != idxR) {
                    if ((lIdxR - idxR) % 2 == 1) {
                        flag = true;
                    }
                }
                if (idxW >= 0 && lIdxW >= 0 && lIdxW != idxW) {
                    if ((lIdxW - idxW) % 2 == 1) {
                        flag = true;
                    }
                }
                if (flag) {
                    flag2 = true;
                    break;
                }
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == 'R') {
                        r.add(new NodeP1534A(i + 1, j + 1));
                    } else if (input.charAt(j) == 'W') {
                        w.add(new NodeP1534A(i + 1, j + 1));
                    }
                }
            }
            if (flag2) {
                rs.add("NO");
            } else {
                if (check(r, w)) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
    
    private static boolean check(List<NodeP1534A> r, List<NodeP1534A> w ) {
        Boolean rs = true;
        for (int i = 0; i < r.size(); i++) {
            for (int j = 0; j < w.size(); j++) {
                if (r.get(i).getN().equals(w.get(j).getN())) {
                    if (Math.abs(r.get(i).getN() - w.get(j).getN()) % 2 == 0) {
                        rs = false;
                        break;
                    }
                }else if (r.get(i).getM().equals(w.get(j).getM())) {
                    if (Math.abs(r.get(i).getM() - w.get(j).getM()) % 2 == 0) {
                        rs = false;
                        break;
                    }
                } else {
                    if (Math.abs(r.get(i).getM() - w.get(j).getM()) % 2 == 0) {
                        if (Math.abs(r.get(i).getN() - w.get(j).getN()) % 2 == 0) {
                            rs = false;
                            break;
                        }
                    } else {
                        if (Math.abs(r.get(i).getN() - w.get(j).getN()) % 2 == 1) {
                            rs = false;
                            break;
                        }
                    }
                }
            }
            if (!rs) {
                break;
            }
        }
        return rs;
    }
}

class NodeP1534A {
    private Integer n;
    private Integer m;

    public NodeP1534A() {
        super();
    }

    public NodeP1534A(Integer n, Integer m) {
        this.n = n;
        this.m = m;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Node [n=" + n + ", m=" + m + "]";
    }

}