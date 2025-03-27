class Solution {
    public int maxDepth(String s) {
        int c=0;
        int max = 0;
        int i =0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                c++;
                i++;
            }else if(s.charAt(i)==')'){
                c--;
                i++;
            }else{
                i++;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}