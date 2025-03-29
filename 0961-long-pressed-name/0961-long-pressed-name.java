class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int nlen = name.length(), tlen = typed.length();
        if (nlen > tlen) return false;
        
        int i = 0, j = 0;
        while (i < nlen && j < tlen) {
            final char nc = name.charAt(i);
            final char tc = typed.charAt(j);
            if (nc == tc) {
                i++;
                j++;
            } else {
                if (j == 0 || tc != typed.charAt(j - 1)) {
                    return false;
                }
                j++;
            }
        }
        while(j<tlen && typed.charAt(j)== typed.charAt(j-1)){
            j++;
        }
        
        return i == nlen && j==tlen;
    }
}