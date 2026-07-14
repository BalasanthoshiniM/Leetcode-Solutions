class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int c=0;
        int mid=nums[n/2];
        for(int i=0;i<n;i++){
            if(nums[i]==mid){
                c++;
            }
        }
        return c==1;
    }
}