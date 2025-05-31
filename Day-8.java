#Q-1:Increasing Triplet Subsequence?
  class Solution {
    public boolean increasingTriplet(int[] nums) {
        int First = Integer.MAX_VALUE;
        int Second = Integer.MAX_VALUE;
        int Third = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){

            int ele = nums[i];

            if(First >= ele){
                First = ele;
            }

            else if (Second >= ele){
                Second = ele; 
            }

            else{
                Third = ele;
                return true;
            }
        }
        return false;
    }
}
