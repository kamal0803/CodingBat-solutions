/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 
This is a little harder than it looks.

withoutX2("xHi") ? "Hi"
withoutX2("Hxi") ? "Hi"
withoutX2("Hi") ? "Hi"
*/

public String withoutX2(String str) {
  
  if(str.length()==0)
    return str;
  
  else if(str.length()>=2 && str.charAt(0)=='x' && str.charAt(1)=='x')
  {
    StringBuilder sb=new StringBuilder(str);
    sb.deleteCharAt(0);
    if(str.length()>0)
      sb.deleteCharAt(0);
    
    return sb.toString();
  }
  
  else if(str.charAt(0)=='x' || str.charAt(1)=='x')
  {
    StringBuilder sb = new StringBuilder(str);
    if(str.charAt(0)=='x')
      sb.deleteCharAt(0);
    else
      sb.deleteCharAt(1);
    
    return sb.toString();
  }
  
  else
    return str;
}
