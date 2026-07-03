class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*int i=0;
        int j=0;
        while(i<m+n-1){
            if(j<n-1 && nums2[j]==nums2[j+1]){
                j++;
            }
            if(nums1[i]<nums2[j] || nums1[i]==nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                int t=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=t;
                i++;
            }
        }
        for(int num :nums2){
            nums1[m]=num;
            m++;
        }*/
        /*int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[k]==0 && i<0 &&j>0){
                for(int a=j;a>=0;a--){
                    nums1[k]=nums2[j];
                    k--;
                }
                break;
            }
            if(nums1[i]>nums2[j] && j>=0|| nums1[i]==nums2[j] && j>=0){
                int temp=nums1[k];
                nums1[k]=nums1[i];
                nums1[i]=temp;
                i--;
            }
            else if(nums2[j]>nums1[i] && i>=0){
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }*/
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]==nums2[j] || nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else if(nums2[j]>nums1[i]){
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        int z=k+1;
        if(i<0 && j>=0){
            for(int a=j;a>=0;a--){
                nums1[k--]=nums2[a];
            }
        }
    }
}