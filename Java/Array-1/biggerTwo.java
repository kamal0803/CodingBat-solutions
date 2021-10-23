/*
Start with 2 int arrays, a and b, each length 2. 
Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) ? [3, 4]
biggerTwo([3, 4], [1, 2]) ? [3, 4]
biggerTwo([1, 1], [1, 2]) ? [1, 2]
*/

public int[] biggerTwo(int[] a, int[] b) {
  int sum_a=0;
  int sum_b=0;
  for(int i=0;i<a.length;i++){
    sum_a=sum_a+a[i];
  }
  for(int i=0;i<b.length;i++){
    sum_b=sum_b+b[i];
  }
  if(sum_a>=sum_b)
    return a;
  else
    return b;
}
