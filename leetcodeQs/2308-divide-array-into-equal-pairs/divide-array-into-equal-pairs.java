class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int req = nums.length/2;
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        for(int key : map.keySet()){
            if(map.get(key)%2==0){
                req-= map.get(key)/2;
            }
        }
        return req==0;
        
    }
}