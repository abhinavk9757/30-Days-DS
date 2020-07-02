/**
 * @problemlink https://leetcode.com/problems/missing-number/
 * This function will find the missing number from a sequence containing numbers from [0....n]
 * with a total array size of n
 * There is only one number missing.
 * 
 * Time complexity :- O(n)
 * Space complexity :- O(1) 
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
function missingNumber(nums) {
    //This sum will store the sum of elements present in array
    let arraySum = 0;
    nums.forEach((num) => {
        arraySum += num;
    });
   /** 
    * As total sum of first n numbers is n(n+1)/2 
    * If we take the difference between actualSum and arraySum, we will find the missing number.
    */
    return ((nums.length * (nums.length + 1)) / 2) - arraySum;
};
