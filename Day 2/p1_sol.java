

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int []a = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            a[i]=i;
        }
        for(int i=0;i<nums.length;i++){
            if(a[i]==nums[i]){
                continue;
            }
            else{
                return a[i];
            }
        }
        return nums.length;
    }
}