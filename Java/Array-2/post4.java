/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. 
The original array will contain at least one 4. 

post4([2, 4, 1, 2]) ? [1, 2]
post4([4, 1, 4, 2]) ? [2]
post4([4, 4, 1, 2, 3]) ? [1, 2, 3]
*/

public int[] post4(int[] nums) {
  int count=0,i;
  for(i=nums.length-1;i>=0;i--){
    if(nums[i]!=4){
      count++;
    }else{
      break;
    }
  }
  int[] a_new=new int[count];
  for(i=0;i<count;i++){
    a_new[i]=nums[nums.length-count+i];
  }
  return a_new;
}
