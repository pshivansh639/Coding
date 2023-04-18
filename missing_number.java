class Solution {
    public int missingNumber(int[] nums) {
        int d=0;
        int n=nums.length;
        Arrays.sort(nums);
        int sum1=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum2=sum2+nums[i];
        }
        return sum1-sum2;
    
        
    }
}
