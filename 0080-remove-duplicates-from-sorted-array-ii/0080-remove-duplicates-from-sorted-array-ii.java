class Solution {
    public int removeDuplicates(int[] nums) {
        /*int n=nums.length;
        int count=0;
        int cnt=0;
        int d=0;
        int k=0;
        if (n<=2) return n;
        else if (n==3){
            if(nums[0]!=nums[1] || nums[1]!=nums[2]) return n;
            else return 2;
        }
        else if(nums[0]==nums[n-1]) return 2;
        for(int i=1;i<n-1;i++){
            if(nums[i-1]==nums[i] && nums[i]==nums[i+1]){
                d++;
                break;
            }
        }
        int i=0;
        int j=1;
        int occ=0;
        int num=nums[0];
        while(i<n && j<n){
            num=nums[i];
            if(d==0) break;
            if(nums[j]==num && occ==0 && j==i+1){
                occ++;
                i++;
            }
            else if(nums[j]==num && occ==0 && j!=i+1){
                i++;
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                occ++;
            }
            else if(nums[j]!=num && nums[j]>num){
                i++;
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                occ=0;
            }
            k=i;
            j++;
       }
       if(d==0) return n;
        return k+1;*/
        int n=nums.length;
        int k=0;
        for(int i:nums){
            if(k<2 || i!=nums[k-2]) nums[k++]=i;
        }
        return k;
    }
}
