class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int area=Integer.MIN_VALUE;
        while(i<=j){
            int w=j-i;
            int h=(height[i]<height[j])?height[i]:height[j];
            area=Math.max(area,h*w);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
}