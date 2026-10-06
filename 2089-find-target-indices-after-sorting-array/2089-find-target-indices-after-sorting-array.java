class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int same=0;
        int lower=0;
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            if(num==target){
                same++;
            }
            else if(num<target){
                lower++;
            }
        }
        if(same==0){
            return list;
        }
        int endindex=lower+same-1;
        int startindex=endindex-same+1;
        for(int i=startindex;i<=endindex;i++){
            list.add(i);
        }
        return list;
    }
}