public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        boolean isBreak = false;
        int[] result = new int[1];

        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length-1; j++){
                int checkTarget = 0;
                int number = nums[i];
                if (nums[j] != number){
                    checkTarget = nums[j] + number;
                    if(checkTarget == target){
                        isBreak = true;
                        result = new int[] {i,j} ;
                        break;
                    }
                }
            }
            if (isBreak == true){
                break;
            }
        }
        return result;
    }
}
