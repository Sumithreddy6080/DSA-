class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder str=new StringBuilder();
        StringBuilder str1=new StringBuilder();
        for(String s:word1) str.append(s);
        for(String i:word2) str1.append(i);

        return str.toString().equals(str1.toString());
        
    }
}