package com.company;

public class TwoSum {

    public static void main(String[] args) {
	// write your code here
    }

    public int[] twoSumBestSolution(int[] nums, int target) {

        java.util.HashMap<Integer,Integer> map= new java.util.HashMap<>();

        for(int i=0;i<nums.length;i++){

            int p=target-nums[i];

            Integer g=map.get(p);

            if(g!=null)
                return new int[]{g,i};
            else
                map.put(nums[i],i);

        }
        return null;
    }

    public int[] twoSumFirst(int[] nums, int target) {

        int[] output = new int[2];

        for(int i = 0; i< nums.length-1; i++)
        {
            for(int j = i+1;j < nums.length; j++ )
            {
                if ( nums[i]+nums[j] == target)
                {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }
}
