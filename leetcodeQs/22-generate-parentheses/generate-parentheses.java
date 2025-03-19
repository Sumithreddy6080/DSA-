class Solution {
    public List<String> generateParenthesis(int n) {
        int open =n;
        int close = n;
        List<String> res = new ArrayList<>();
        String temp ="";
        solve(open,close,temp,res);
        return res;
    }
    void solve(int open,int close,String temp, List<String> res){
        if( close ==0 && open==0 && open+close==0){
            res.add(temp);
            return;
        }
        if(open>0){
            solve(open-1,close,temp+"(",res);
        }
        if(open<close){
            solve(open,close-1,temp+")",res);
        }
        return;
    }
}