/*
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. 

makeLast([4, 5, 6]) ? [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) ? [0, 0, 0, 2]
makeLast([3]) ? [0, 3]
*/

public int[] makeLast(int[] nums) {
  int[] a=new int[nums.length+nums.length];
  a[nums.length+nums.length-1]=nums[nums.length-1];
  
  for(int i=0;i<nums.length+nums.length-1;i++){
    a[i]=0;
  }
  return a;
}
