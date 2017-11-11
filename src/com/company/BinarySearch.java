package com.company;

public class BinarySearch {

    private int[] nums;
    private int target;

    public BinarySearch(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int find() {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        } else if (nums[start] < target && nums[end] > target) {
            return -2;
        } else if (nums[start] > target) {
            return -1;
        } else {
            return nums.length;
        }
    }
}