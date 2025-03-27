class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for(int i =0; i<s.length();i++){
            if(hash2[(int)(t.charAt(i)-'a')] != hash1[(int)(s.charAt(i)-'a')]) return false;
            hash1[(int)(s.charAt(i)-'a')]++;
            hash2[(int)(t.charAt(i)-'a')]++;
        }
        return true;
    }
}