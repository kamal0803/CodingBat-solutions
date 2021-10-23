/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) ? true
double23([3, 3]) ? true
double23([2, 3]) ? false
*/

public boolean double23(int[] nums) {
  int count_two=0;
  int count_three=0;
  for(int i=0;i<nums.length;i++){
    if(nums[i]==2){
      count_two++;
    }else if(nums[i]==3){
      count_three++;
    }
  }
  return (count_two==2 || count_three==2);
}
