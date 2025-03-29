class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "AEIOUaeiou";
        int n = s.length();
        int count1 = 0, count2 = 0;
        
        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count1++;
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) count2++;
        }
        
        return count1 == count2;
    }
}
