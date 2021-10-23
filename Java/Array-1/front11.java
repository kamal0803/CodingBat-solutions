/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) ? [1, 7]
front11([1], [2]) ? [1, 2]
front11([1, 7], []) ? [1]
*/

public int[] front11(int[] a, int[] b) {
  int len=0;
  
  if(a.length==0 && b.length==0){
    return new int[0];
  }
  
  if(a.length!=0 && b.length!=0){
    len=2;
  }
  else{
    len=1;  
  }
  int[] a_new=new int[len];
  
  int k=0;
  if(a.length!=0){
    a_new[k]=a[0];
    k++;
  }
  if(b.length!=0){
    a_new[k]=b[0];
  }
  
  return a_new;
}
