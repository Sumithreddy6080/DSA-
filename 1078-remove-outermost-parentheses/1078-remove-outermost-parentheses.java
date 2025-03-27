class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder  res = new StringBuilder("");
        int b =0;
        for(char c : s.toCharArray()){
            if(c=='('){
                if(b>0) res.append(c);
                b++;
            }else{
                b--;
                if(b>0) res.append(c);
            }
       }
       return res.toString();
    }
}