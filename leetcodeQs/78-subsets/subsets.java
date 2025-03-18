class Solution {
    int n;
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> li = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        n=nums.length;
        solve(0,l1,nums,li);
        return li;  
    }
    void solve(int index,List<Integer> temp,int[] nums,  List<List<Integer>> li){
        if(index>=n){
            System.out.println(temp);
            li.add(new ArrayList<>(temp));
            return;
        }
       int n = nums[index];
       temp.add(n);
       solve(index+1,temp,nums,li);
       temp.remove(temp.size()-1);
       solve(index+1,temp,nums,li);
    }
}