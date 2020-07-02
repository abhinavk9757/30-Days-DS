/**
 * @problemlink https://leetcode.com/problems/maximum-subarray/
 * This function will find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * Time complexity :- O(n)
 * Space complexity :- O(1)
 * Kadane's Algorithm
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    //Will represent the currentSum of any contiguos subarray
    let currentSum=-Infinity;
    //Will represent the max sum out of all contiguos subarray after every pass
    let maxSoFar=-Infinity;
    for(let i=0;i<nums.length;i++){
        currentSum=Math.max(currentSum+nums[i],nums[i]);
        maxSoFar=Math.max(maxSoFar,currentSum);
    }
    return maxSoFar;
};

//TODO :- Complete the solution using divide and conquer approach.