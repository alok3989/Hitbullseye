class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairsCount = 0;
        // Array to store frequency of each number (constraints: 1 <= nums[i] <= 100)
        int[] frequency = new int[101];
      
        // Iterate through each number in the array
        for (int number : nums) {
            // Before incrementing, frequency[number] represents how many times
            // we've seen this number before, which equals the number of good pairs
            // we can form with the current occurrence
            goodPairsCount += frequency[number];
          
            // Increment the frequency count for this number
            frequency[number]++;
        }
      
        return goodPairsCount;
    }
}