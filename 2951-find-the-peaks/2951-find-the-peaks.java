class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n=mountain.length;
        int l=mountain[0];
        int r=mountain[n-1];
        List <Integer> list=new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                list.add(i);
            }
        }
        return list;
    }
}