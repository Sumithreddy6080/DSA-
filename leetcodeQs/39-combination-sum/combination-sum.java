class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ot = new ArrayList<>();
        solve(candidates,target,0,0,ans,ot);
        return ans;
    }
    void solve(int[] candidates, int target,int sum,int index, List<List<Integer>> ans,  List<Integer> ds){
        if(index==candidates.length){
            if(sum==target){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[index]+sum<=target){
            ds.add(candidates[index]);
            solve(candidates,target,candidates[index]+sum,index,ans,ds);
            ds.remove(ds.size()-1);
        }
        solve(candidates,target,sum,index+1,ans,ds);
    
   
    }
}