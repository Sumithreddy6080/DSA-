class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            int l=i;
            int h=i;
            while((l>=0 && h<s.length()) && (s.charAt(l) == s.charAt(h))){
                if((h-l)>=ans.length()){
                    ans=s.substring(l,h+1);
                }
                l--;
                h++;
            }
             l=i;
             h=i+1;
            while((l>=0 && h<s.length()) && (s.charAt(l) == s.charAt(h))){
                if((h-l)>=ans.length()){
                    ans=s.substring(l,h+1);
                }
                l--;
                h++;
            }

        }
        return ans;
    }
}