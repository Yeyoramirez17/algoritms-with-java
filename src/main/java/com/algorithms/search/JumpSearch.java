package com.algorithms.search;

public class JumpSearch {

    /**
     * Performs a jump search algorithm to find the index of a target value in a sorted array.
     * 
     * Jump search works by jumping through the array in fixed steps, then performing
     * a linear search within the identified block.
     * 
     * @param arr the sorted array to search through
     * @param toSearch the value to find in the array
     * @return the index of toSearch if found, or -1 if not found
     * 
     * Time Complexity: O(√n) where n is the length of the array
     * Space Complexity: O(1)
     * 
     * Algorithm breakdown:
     * - Line 2: Get the array length
     * - Line 3: Calculate the jump step size as the square root of the search value (should be √n for optimal performance)
     * - Line 5-6: Initialize current position and previous position pointers
     * - Line 8-11: Jump through the array in steps until finding a block where toSearch could exist
     * - Line 13-17: Linear search within the identified block to find the exact index
     * - Line 19: Return -1 if the value is not found in the array
     */
    public static int search(int[] arr, int toSearch) {
        int n = arr.length;
        int jump = (int) Math.floor(Math.sqrt(n));

        int curr = jump;
        int prev = 0;

        while(curr < n && arr[curr] <= toSearch) {
            prev = curr;
            curr += jump;
        }

        for(int i = prev; i < Math.min(curr, n); i++) {
            if(arr[i] == toSearch) {
                return i;
            }
        }

        return -1;
    }

}
