/*

Return true if the given non-negative number is a multiple of 3 or 5, but not both.
*/

public boolean old35(int n) {
  if(n%15==0)
    return false;
  else if(n%5==0)
    return true;
  else if(n%3==0)
    return true;
  else
    return false;
}
