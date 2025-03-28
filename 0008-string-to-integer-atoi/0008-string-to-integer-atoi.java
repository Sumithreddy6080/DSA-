class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        s = s.trim();
        int sign = 1;
        int i = 0;

        if (s.isEmpty()) return 0;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }

        return ans * sign;
    }
}
