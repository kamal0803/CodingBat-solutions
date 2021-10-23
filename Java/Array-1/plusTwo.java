/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) ? [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) ? [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) ? [9, 2, 3, 4]
*/

public int[] plusTwo(int[] a, int[] b) {
  int i;
  int new_a[]=new int[4];
  for(i=0;i<a.length;i++){
    new_a[i]=a[i];
  }
  for(i=0;i<b.length;i++){
    new_a[i+2]=b[i];
  }
  return new_a;
}


