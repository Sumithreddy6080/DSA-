class Solution {
    public String largestOddNumber(String num) {
        int a = -1;
        a = Math.max(num.lastIndexOf('1'), a);
        a = Math.max(num.lastIndexOf('3'), a);
        a = Math.max(num.lastIndexOf('5'), a);
        a = Math.max(num.lastIndexOf('7'), a);
        a = Math.max(num.lastIndexOf('9'), a);

        if(a == -1) {
            return "";
        }
        return num.substring(0, a + 1);
    }
}