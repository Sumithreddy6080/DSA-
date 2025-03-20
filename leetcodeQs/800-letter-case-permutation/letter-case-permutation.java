class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        solve("",s,0);
        return ans;
    }
    
    public void solve(String curr, String s, int i) { 
        if (i == s.length()) {
            ans.add(curr); 
            return;
        }
        if (Character.isDigit(s.charAt(i))) { 
            solve(curr + s.charAt(i), s, i + 1);
        } else {
            solve(curr + Character.toLowerCase(s.charAt(i)), s, i + 1);
            solve(curr + Character.toUpperCase(s.charAt(i)), s, i + 1);
        }
    }
}