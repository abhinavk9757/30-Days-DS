/**
 * @problemlink https://leetcode.com/problems/sort-colors/
 * This function will sort an array of colors representing colors as numbers [0,1,2]
 * Each number can repeat itself any times.
 * Time complexity :- O(n)
 * Space complexity :- O(1)
 * Two pass algorithm
 */

 /**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    //Count variables to store count of 0,1,2.
    let count0=0,count1=0,count2=0;
    nums.forEach(num=>{
        num==0?count0++:(num==1)?count1++:count2++;
    });
    let i=0;
    //Stuffing 0's at the start
    while(i<count0){
        nums[i]=0;
        i++;
    }
    //Then stuffing 1's
    while(i<count0+count1){
        nums[i]=1;
        i++;
    }
    //Then stuffing 2's
    while(i<nums.length){
        nums[i]=2;
        i++;
    }
};

//TODO :- Complete the above solution in One Pass