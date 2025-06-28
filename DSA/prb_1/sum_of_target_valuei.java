
package DSA.prb_1;

import java.util.HashMap;

class sum_of_target_valuei {

    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> seen = new HashMap<>();
        
        for(int i = 0; i <  nums.length; i++){
            int num = nums[i];
            int complement =  target - num;

            if(seen.containsKey(complement)){
            return new int[] {seen.get(complement), i};
         }
         seen.put(num, i);
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        int[] nums = {2,4,5,1};
        int target = 6;

        int[] result = twoSum(nums,target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
    
}