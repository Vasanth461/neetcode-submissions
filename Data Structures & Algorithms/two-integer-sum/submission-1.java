class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i] + nums[j] == target && i!=j){
                    if(i<j){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    } else {
                    resultArray[0] = j;
                     resultArray[1] = i;
                    }
                }

            }
        }
        return resultArray;
    }
}
