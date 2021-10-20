/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) ? true
array123([1, 1, 2, 4, 1]) ? false
array123([1, 1, 2, 1, 2, 3]) ? true
*/

public boolean array123(int[] nums) {
  for(int i=0;i<nums.length;i++){
    if(nums[i]==1 && i+1<nums.length){
      if(nums[i+1]==2 && i+2<nums.length){
        if(nums[i+2]==3){
          return true;
        }
      }
    }
  }
  return false;
}
