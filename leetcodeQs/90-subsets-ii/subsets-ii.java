class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        solve(nums,0,set,new ArrayList<>());
        return new ArrayList<>(set);
    }
    void solve(int[] nums,int index,Set<List<Integer>> set,List<Integer> ds){
        if(index==nums.length){
            set.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        solve(nums,index+1,set,ds);
        ds.remove(ds.size()-1);
        solve(nums,index+1,set,ds);

    }
}