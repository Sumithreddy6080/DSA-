class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i =0;i<goal.length();i++){
            if(s.equals(goal)) return true;
            s= s.substring(1,s.length())+s.substring(0,1);
        }
        return false;
    }
}