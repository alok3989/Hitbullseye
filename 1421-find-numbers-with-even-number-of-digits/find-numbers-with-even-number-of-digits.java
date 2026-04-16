class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for (int i = 0;i<nums.length;i++)
        {
            int x=digit(nums[i]);
            
            if (x%2==0)
            {
                c++;
            }

        }
        return c;
        
    }

    public int digit (int n)

    {
        return (int)(Math.log10(n))+1;
    }
}