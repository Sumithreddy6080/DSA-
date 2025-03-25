class Solution {
    public String defangIPaddr(String address) {
      String ans="";
        for(int i=0;i<address.length();i++){
            char var=address.charAt(i);
            if(var=='.') ans+="[.]";
            else ans+=var;
        }
        return ans;
    }
}