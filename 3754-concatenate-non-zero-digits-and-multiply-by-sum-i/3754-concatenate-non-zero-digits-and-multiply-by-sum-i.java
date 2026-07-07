class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        int sum=0;
        while(n>0){
            int dig=n%10;
            if(dig!=0){
                num=num*10+dig;
                sum+=dig;
            }
            n/=10;
        }
        long res=0;
        while(num>0){
            long dig=num%10;
            res=res*10+dig;
            num/=10;
        }

        return res*sum;
    }
}