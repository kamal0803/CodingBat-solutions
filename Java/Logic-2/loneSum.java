/*

Given 3 int values, a b c, return their sum. 
However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) ? 6
loneSum(3, 2, 3) ? 2
loneSum(3, 3, 3) ? 0
*/

public int loneSum(int a, int b, int c) {
  int sum=0;
  if(a==b && b==c && a==c){
    sum=0;
  }
  else if(a==b){
    sum=sum+c;
  }
  else if(a==c){
    sum=sum+b;
  }
  else if(b==c){
    sum=sum+a;
  }
  else{
    sum=sum+a+b+c;
  }
  return sum;
}
