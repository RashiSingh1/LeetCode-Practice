class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0 , original = x;
        while(x>0){
            sum = sum +x%10;
            x /= 10;
        }
        if(original % sum ==0){
            return sum;
        }
        return -1;
    }
}