class Solution {
    public boolean isSubsequence(String s, String t) {
        int sn=s.length();
        int tn=t.length();
        int i=0;
        int j=0;
        if(sn==0){
            return true;
        }
        while(i<sn && j<tn){
            if(t.charAt(j)!=s.charAt(i)){
                j++;
            }
            else if(s.charAt(i)==t.charAt(j) && i==sn-1){
                return true;
            }
            else{
                i++;
                j++;
            }
        }
        return false;
    }
}