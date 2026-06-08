class Solution {
    public String finalString(String s) {
        StringBuilder sb= new StringBuilder();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(ch=='i'){
                sb.reverse();
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
