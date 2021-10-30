/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) ? true
either24([4, 4, 1]) ? true
either24([4, 4, 1, 2, 2]) ? false
*/

public boolean either24(int[] nums) {
  boolean consecutiveTwo=false;
  boolean consecutiveFour=false;
  
  for(int i=0;i<nums.length;i++){
    if(nums[i]==2){
      if(i+1<nums.length && nums[i+1]==2){
        consecutiveTwo=true;
      }
    }
    if(nums[i]==4){
      if(i+1<nums.length && nums[i+1]==4){
        consecutiveFour=true;
      }
    }
  }
  
  return (consecutiveTwo==true && consecutiveFour==false || consecutiveTwo==false && consecutiveFour==true);
}