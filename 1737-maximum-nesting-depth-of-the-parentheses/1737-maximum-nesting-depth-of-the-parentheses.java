class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int ct=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                ct++;
                depth=Math.max(depth,ct);
            }
            else if(c==')')
            {
                ct--;
            }
        }
        return depth;  
    }
}