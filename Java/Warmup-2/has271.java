/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. 
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) ? true
has271([1, 2, 8, 1]) ? false
has271([2, 7, 1]) ? true
*/

public boolean has271(int[] nums) {
  int i,x,t;
  for(i=0;i<nums.length;i++){
    x=nums[i];
    if(i+1<nums.length && nums[i+1]==x+5){
      if(i+2<nums.length){
        if(x-nums[i+2]<=3 && x-nums[i+2]>=-1)
          return true;
      }
    }
  }
  return false;
}
