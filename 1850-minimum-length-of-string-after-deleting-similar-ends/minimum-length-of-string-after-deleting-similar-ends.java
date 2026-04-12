class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        // Continue while pointers haven't met and the characters at both ends match
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char currentChar = s.charAt(left);
            
            // Move the left pointer forward as long as the character matches
            while (left <= right && s.charAt(left) == currentChar) {
                left++;
            }
            
            // Move the right pointer backward as long as the character matches
            while (left <= right && s.charAt(right) == currentChar) {
                right--;
            }
        }
        
        // The remaining length is the distance between the two pointers
        return right - left + 1;
    }
}