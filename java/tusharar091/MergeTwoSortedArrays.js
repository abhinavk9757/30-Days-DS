
/**
 * This function taks two sorted arrays and merge them in-place without using any extra space
 * As arrays are pass by reference no need to return a merged array
 * Time complexity :- O(m*n), m->length of arr1, n->length of arr2
 * Space complexity :- O(1)
 */

/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 */
const mergeSortedArrays = (arr1, arr2) => {
    //Starting with last element from array2
    for (let i = arr2.length - 1; i >= 0; i--) {
        /**
         * For every element, Iterating from last element in first array until the correct index is found
         * This index will represent the correct position for ith element in array1
         * Will traverse until array1 is exhausted or while elements in array1 are larger than ith element in array2
         */
        let j = arr1.length - 1;
        while (j > 0 && arr2[i] <= arr1[j]) {
            //While finding the correct index, preserving/sorting the order in array1 if elements are displaced 
            if (arr1[j - 1] > arr1[j]) {
                swapElements(arr1, j - 1, j);
            }
            j--;
        }
        //Placing the ith element where it belongs in array1, i.e the correct order
        swapElements(arr1, j + 1, i, arr2);
        if (arr2[i] < arr1[arr1.length - 1]) {
        //Swapping last element of array1 with ith element in arr2, it will ensure maximum of array1 is pushed to extreme right in array2
        //After every pass, if ith element of array2 is smaller than last element of array1
            swapElements(arr1, arr1.length - 1, i, arr2);
        }
    }
    let j = arr1.length - 1;
    //Sorting array1 elements for one last time, if elements were displaced in the last iteration
    //This step can be avoided by improvising the logic in for loop
    while (j > 0) {
        if (arr1[j - 1] > arr1[j]) {
            swapElements(arr1, j - 1, j);
        }
        j--;
    } 
}

/**
 * This function will swap ith and jth elements 
 * whether they belong to a single array, or belong to two different arrays.
 * 
 * Case 1(arr2 is undefined) :- m->length of arr1 0<={i,j}<=m-1
 * Case 2 (arr2 is defined) :- m->length of arr1, n->length of arr2, 0<=i<=m-1,  0<=j<=n-1
 * @param {number[]} arr1
 * @param {number} i 
 * @param {number} j
 * @param {number[]} arr2
 */
const swapElements = (arr1, i, j, arr2) => {
    if (i >= arr1.length) return;
    if (arr2 == undefined || arr2.length == 0) {
        arr1[i] += arr1[j];
        arr1[j] = arr1[i] - arr1[j];
        arr1[i] = arr1[i] - arr1[j];
        return;
    }
    if (j >= arr2.length) return;
    arr1[i] += arr2[j];
    arr2[j] = arr1[i] - arr2[j];
    arr1[i] = arr1[i] - arr2[j];
}

//TODO :- Optimise code style to avoid extra sort after for loop is finished.