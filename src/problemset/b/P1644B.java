package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class P1644B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            List<String> tmp = new ArrayList<String>();
            for(int j = n; j> 0; j--) {
                List<String> tmp2 = test(n, j);
                tmp.addAll(tmp2);
                if (tmp.size() >= n) {
                    tmp = tmp.subList(0,  n);
                    break;
                }
            }
            StringBuffer buffer = new StringBuffer();
            for (String string : tmp) {
                buffer.append(string).append("\n");
            }
            rs.add(buffer.toString());
        }
        for (String string : rs) {
            System.out.print(string);
        }
    }
    
    private static Node gen(Integer n, Integer target, Integer root) {
        Node rs = new Node();
        rs.setId(root);
        rs.setLevel(n);
        if (rs.getLevel().equals(target)) {
            
        }
        return rs;
    }
    private static List<String>  test(Integer n, Integer s) {
        List<String> rs = new ArrayList<String>();
        Queue<String> queue = new LinkedBlockingQueue<String>();
        Map<String, Set<Integer>> map = new HashMap<String, Set<Integer>>();
        String init = s.toString() + " ";
        Set<Integer> set = new HashSet<Integer>();
        set.add(s);
        map.put(init, set);
        queue.offer(init);
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            for(int i = 1;i <= n; i++) {
                if (!map.get(cur).contains(i)) {
                    if (cur.length() >= 4) {
                        Integer sum = Integer.valueOf(String.valueOf(cur.charAt(cur.length() - 2))) + Integer.valueOf(String.valueOf(cur.charAt(cur.length() - 4)));
                        if (!sum.equals(i)) {
                            StringBuffer buffer = new StringBuffer();
                            buffer.append(cur).append(i).append(" ");
                            
                            Set<Integer> tmpSet = new HashSet<Integer>();
                            tmpSet.addAll(map.get(cur));
                            tmpSet.add(i);
//                            System.out.println(buffer + " " + buffer.length());
                            if (buffer.toString().length() != (n * 2)) {
                                queue.offer(buffer.toString());
                                map.put(buffer.toString(), tmpSet);
                            } else {
                                rs.add(buffer.toString());
                                map.put(buffer.toString(), tmpSet);
                            }
                        }
                    } else {
                        StringBuffer buffer = new StringBuffer();
                        buffer.append(cur).append(i).append(" ");
                        
                        Set<Integer> tmpSet = new HashSet<Integer>();
                        tmpSet.addAll(map.get(cur));
                        tmpSet.add(i);
//                    System.out.println(buffer + " " + buffer.length());
                        if (buffer.toString().length() != (n * 2)) {
                            queue.offer(buffer.toString());
                            map.put(buffer.toString(), tmpSet);
                        } else {
                            rs.add(buffer.toString());
                            map.put(buffer.toString(), tmpSet);
                        }
                    }
                }
            }
        }
//        System.out.println(rs.size());
//        for (String string : rs) {
//            System.out.println(string);
//        }
//        System.out.println("=======================");
        return rs;
    }
    
//    private static List<String>  test(Integer n, Integer s) {
//        List<String> rs = new ArrayList<String>();
//        Queue<String> queue = new LinkedBlockingQueue<String>();
//        Map<String, Set<Integer>> map = new HashMap<String, Set<Integer>>();
//        String init = s.toString() + " ";
//        Set<Integer> set = new HashSet<Integer>();
//        set.add(s);
//        map.put(init, set);
//        queue.offer(init);
//        while (!queue.isEmpty()) {
//            String cur = queue.poll();
//            for(int i = 1;i <= n; i++) {
//                if (!map.get(cur).contains(i)) {
//                    StringBuffer buffer = new StringBuffer();
//                    buffer.append(cur).append(i).append(" ");
//                    
//                    Set<Integer> tmpSet = new HashSet<Integer>();
//                    tmpSet.addAll(map.get(cur));
//                    tmpSet.add(i);
////                    System.out.println(buffer + " " + buffer.length());
//                    if (buffer.toString().length() != (n * 2)) {
//                        queue.offer(buffer.toString());
//                        map.put(buffer.toString(), tmpSet);
//                    } else {
//                        rs.add(buffer.toString());
//                        map.put(buffer.toString(), tmpSet);
//                    }
//                }
//            }
//        }
////        System.out.println(rs.size());
////        for (String string : rs) {
////            System.out.println(string);
////        }
//        return rs;
//    }
}

class Node {
    private Integer id;
    private Integer level;
    private String val;
    
    private List<Node> children;
    public Node(Integer id, Integer level) {
        this.id = id;
        this.level = level;
    }
    public Node(Integer id) {
        this.id = id;
    }
    public Node() {
        super();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public List<Node> getChildren() {
        return children;
    }
    public void setChildren(List<Node> children) {
        this.children = children;
    }
    public String getVal() {
        return val;
    }
    public void setVal(String val) {
        this.val = val;
    }
    @Override
    public String toString() {
        return "Node [id=" + id + ", level=" + level + ", val=" + val + ", children=" + children
                + "]";
    }
    
}
