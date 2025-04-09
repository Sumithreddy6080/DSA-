class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            int addSq = getsquare(n);
            if(set.contains(addSq)) break;
            set.add(addSq);
            n=addSq;
        }
        return set.contains(1);
    }
    int getsquare(int num){
        if(num == 0) return 0;
        int rem =0;
        int ans =0;
        while(num>0){
           rem = num%10;
           ans += rem*rem;
           num= num/10; 
        }
        return ans;
    }
}