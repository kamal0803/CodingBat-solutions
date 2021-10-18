/*

We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) ? true
loneTeen(21, 19) ? true
loneTeen(13, 13) ? false

*/
public boolean loneTeen(int a, int b) {
  
  if((a>=13 && a<=19) && (b>=13 && b<=19))
    return false;
  
  int count=0;
  if(a>=13 && a<=19)
    count++;
  
  if(b>=13 && b<=19)
    count++;
  
  if(count==1)
    return true;
  else
    return false;
  
}
