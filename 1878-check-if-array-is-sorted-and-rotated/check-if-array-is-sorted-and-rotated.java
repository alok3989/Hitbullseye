class Solution {
    public boolean check(int[] n) {
        int l= n.length; // Calculating length of given array.
        int nRotation=0;// Declaring a variable to keep a count of number of rotations.
//Running a for loop to identify any rotation in given array.
        for(int i=0;i<l;i++){
            if(n[i]>n[(i+1)%l]){
                nRotation++;
            }
        }
//If number of rotations are greater than 1 return false.
        if(nRotation>1)
            return false;
//Else return True.
        return true;

    }
}