class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hash = new int [300];
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            hash[(int)s.charAt(i)]++;
            hash[(int)t.charAt(i)]--;
        }
        for(int i : hash) if(i !=0) return false;
        return true;
    }
}