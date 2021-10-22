/*
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. 

sumLimit(2, 3) ? 5
sumLimit(8, 3) ? 8
sumLimit(8, 1) ? 9
*/

public int sumLimit(int a, int b) {
  int sum=a+b;
  int digits_a=(String.valueOf(a)).length();
  int digits_sum=(String.valueOf(sum)).length();
  
  if(digits_sum>digits_a)
    return a;
  else
    return sum;
  
}
