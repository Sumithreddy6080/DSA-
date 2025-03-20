class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ot = new ArrayList<>();
        solve(candidates,target,0,0,ot,ans);
        return ans;
    }
    void solve(int[] candidates, int target,int index,int sum,List<Integer> ot,List<List<Integer>> ans){
        if(index>=candidates.length){
            if(sum==target){
                ans.add(new ArrayList<>(ot));
            }
            return;
        }
        if(sum>target) return;
        if(candidates[index]<=target){
            ot.add(candidates[index]);
            solve(candidates,target,index,sum+candidates[index],ot,ans);
            ot.remove(ot.size()-1);
        }
          solve(candidates,target,index+1,sum,ot,ans);

    }
}