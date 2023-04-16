class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,k=0;
        for(i=m;i<nums1.length;i++)
        {
            nums1[i]=nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        for(int j=0;i<nums1.length;j++)
        {
            System.out.print(nums1[i]+",");
        }
    }
}
