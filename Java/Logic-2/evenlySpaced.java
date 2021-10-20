/*
Given three ints, a b c, one of them is small, one is medium and one is large. 
Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) ? true
evenlySpaced(4, 6, 2) ? true
evenlySpaced(4, 6, 3) ? false
*/

public boolean evenlySpaced(int a, int b, int c) {
  int min,med,max;
  
  if(a>b && a>c){
    max=a;
  }else if(b>a && b>c){
    max=b;
  }else{
    max=c;
  }
  
  if(a<b && a<c){
    min=a;
  }else if(b<a && b<c){
    min=b;
  }else{
    min=c;
  }
  
  if(a!=max && a!=min)
    med=a;
  else if(b!=max && b!=min)
    med=b;
  else
    med=c;
    
  if((med-min)==(max-med))
    return true;
  else
    return false;
  
}
