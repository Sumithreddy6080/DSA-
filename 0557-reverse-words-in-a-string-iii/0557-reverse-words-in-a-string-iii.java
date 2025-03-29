class Solution {
    public String reverseWords(String s) {
        String[] strarr = s.split(" ");
        for(int i=0; i<strarr.length;i++){
            strarr[i]= reverse(strarr[i]);
        }
        return String.join(" ",strarr);
    }
    String reverse(String s){
   StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}