/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. 
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) ? [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) ? [0, 0, 1, 1, 1]
zeroFront([1, 0]) ? [0, 1]
*/

public int[] zeroFront(int[] nums) {
  int i,k;
  int count_zero=0;
  for(i=0;i<nums.length;i++){
    if(nums[i]==0){
      count_zero++;
    }
  }
  k=nums.length-1;
  for(i=nums.length-1;i>=0;i--){
    if(nums[i]!=0){
      nums[k]=nums[i];
      k--;
    }
  }
  i=0;
  while(i<count_zero){
    nums[i]=0;
    i++;
  }
  return nums;
}
