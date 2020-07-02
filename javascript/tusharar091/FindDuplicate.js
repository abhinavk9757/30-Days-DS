
/**
 * @problemlink https://leetcode.com/problems/find-the-duplicate-number/
 * This function will find the duplicate number from a sequence containing numbers from [1....n]
 * with a total array size of n+1
 * There will only be one duplicate but that duplicate number can repeat n+1 times max.
 * 
 * Solving with brute force approach.
 * Time complexity :- O(n^2)
 * Space complexity :- O(1);
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    let duplicate;
    let isEnd=false;
    for(let i=0;i<nums.length;i++){
        for(let j=0;j<nums.length;j++){
            if(i!=j&&nums[i]===nums[j]){
                duplicate=nums[i];
                isEnd=true;
                break;
            }
        }
        if(isEnd){
            break;
        }
    }
    return duplicate;
};

//TODO :- Improvise the solution to be in O(n)