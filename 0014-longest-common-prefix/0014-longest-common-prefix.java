class Solution {
    public String longestCommonPrefix(String[] strs) {
      String res = "";
      for(int i=0;i<strs[0].length();i++){
        char ch = strs[0].charAt(i);
        for(String s:strs){
            if(i >= s.length() || ch!=s.charAt(i)){
                return res;
            }  
        }
        res +=ch;
      }
      return res;
    }
}