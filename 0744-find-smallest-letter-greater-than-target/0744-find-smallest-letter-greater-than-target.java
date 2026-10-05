class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int low=0;
        int high=n-1;
        if(letters[n-1]<= target) return letters[0];
        while(low<=high){
            int mid=low+(high-low/2);
            if(letters[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return letters[low];
    }
}