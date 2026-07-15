class Solution {
    public int gcdOfOddEvenSums(int n) {
        int es=0;
        int os=-1;
        int e=0;
        int o=-1;
        for(int i=1;i<=n;i++){
            os+=o+2;
            es+=e+2;
            o+=2;
            e+=2;
        }
        int num=1;
        for(int i=2;i<=n;i++){
            if((os+1)%i==0 && es%i==0) {
                num=i;
            }
        }

        return num;
    }
}