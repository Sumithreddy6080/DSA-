class Solution {
    public String longestPalindrome(String s) {
        // if(s.length()==1) return s;
        StringBuilder ans = new  StringBuilder("");
        int maxlen =0;
        for(int i =0; i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sb = s.substring(i,j+1);
                if(isPalin(sb) && sb.length()>maxlen){
                    maxlen = sb.length();
                    ans = new StringBuilder(sb);
                }
            }
        }
        return ans.toString();
    }
    boolean isPalin(String str){
        int l=0;
        int h=str.length()-1;
        if(h<=0) return true;
        while(l<h){
            if(str.charAt(l) != str.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
}