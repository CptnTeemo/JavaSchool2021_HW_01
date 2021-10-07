package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        // Task implementation
        for (int i = 0, j = nums.length - 1; i < nums.length; ) {
            while (j > 0) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                } else if (nums[i] + nums[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
            break;
        }
        return new int[0];
    }
}
