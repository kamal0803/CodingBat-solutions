/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 

shareDigit(12, 23) ? true
shareDigit(12, 43) ? false
shareDigit(12, 44) ? false
*/

public boolean shareDigit(int a, int b) {
  int left_a=a/10;
  int right_a=a%10;
  
  int left_b=b/10;
  int right_b=b%10;
  
  if(left_a==left_b || left_a==right_b)
    return true;
  if(right_a==left_b || right_a==right_b)
    return true;
  return false;
}
