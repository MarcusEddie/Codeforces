package problemset.algrithms;

public class Commons {

    public static Long gcd(Long a, Long b) {
        if (b.compareTo(0L) == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(5L, 0L));
    }

    public static boolean equals(StringBuffer sb1, StringBuffer sb2) {

        if (sb1 == sb2)
            return true;
        if (sb1 == null || sb2 == null)
            return false;

        boolean isEqual = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {

                if (sb1.charAt(i) != sb2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        return isEqual;
    }
}
