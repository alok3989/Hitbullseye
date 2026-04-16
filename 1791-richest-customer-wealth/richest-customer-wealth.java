class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        // Loop through each customer (the rows)
        for (int i = 0; i < accounts.length; i++) {
            
            int currentCustomerWealth = 0; // Reset wealth to 0 for each new customer
            
            // Loop through each bank account for the current customer (the columns)
            for (int j = 0; j < accounts[i].length; j++) {
                // Add the whole amount in the bank account to the customer's total
                currentCustomerWealth = currentCustomerWealth + accounts[i][j]; 
            }
            
            // After checking all their accounts, see if they are the richest so far
            if (currentCustomerWealth > max) {
                max = currentCustomerWealth;
            }
        }

        return max;
    }
}