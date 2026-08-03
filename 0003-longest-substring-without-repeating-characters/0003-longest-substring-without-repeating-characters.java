class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        boolean[] visited=new boolean[256];
        int left=0;
        for(int right=0;right<n;right++){
            char current=s.charAt(right);
            while(visited[current]){
                visited[s.charAt(left)]=false;
                left++;
            }
            visited[current]=true;
            if(right-left+1>maxlen){
                maxlen=right-left+1;
            }
        }
        return maxlen;
    }
}