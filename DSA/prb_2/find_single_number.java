package DSA.prb_2;

import java.util.*;

public class find_single_number {


    public static int findSingle(int[] nums){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }


        for(int key : freq.keySet()){
        
            if(freq.get(key)==1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1,2};
        int result = findSingle(nums);
        System.out.println(result);
    }
}
