class Solution {
    public int romanToInt(String s) {
         Map<Character,Integer> map = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
       int sum = map.get(s.charAt(0));
       for(int i=1;i<s.length();i++){
        sum+=map.get(s.charAt(i));
        if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
            sum-= 2*(map.get(s.charAt(i-1)));
        }
       }
       return sum;
    }
}