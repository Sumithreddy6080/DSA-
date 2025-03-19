class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag = true && n!=0;
        while(n!=0){
            if(n%2==0){
                n= n/2;
            }else{
                if(n==1) break;
                flag=false;
                break;
            }
        }
        return flag;
        
    }
}