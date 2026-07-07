class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You are in the decreasing part of the mountain
                // This may be the answer, but look at left
                end = mid;
            } else {
                // You are in the ascending part of the mountain
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // In the end, start == end and pointing to the largest number because of the above two checks
        return start; // or return end as both are equal
    }
        
    }

