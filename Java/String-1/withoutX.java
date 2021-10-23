/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") ? "Hi"
withoutX("xHi") ? "Hi"
withoutX("Hxix") ? "Hxi"

*/

public String withoutX(String str) {
  
  if(str.length()==0)
    return str;
  
  else if(str.length()>=2 && str.charAt(0)=='x' && str.charAt(str.length()-1)=='x')
  {
    StringBuilder sb=new StringBuilder(str);
    sb.deleteCharAt(0);
    String str1=sb.toString();
    StringBuilder sb1=new StringBuilder(str1);
    sb1.deleteCharAt(str1.length()-1);
    return sb1.toString();
  }
  else if(str.charAt(0)=='x')
  {
    StringBuilder sb=new StringBuilder(str);
    sb.deleteCharAt(0);
    return sb.toString();
  }
  else if(str.charAt(str.length()-1)=='x'){
    StringBuilder sb=new StringBuilder(str);
    sb.deleteCharAt(str.length()-1);
    return sb.toString();
  }
  else
    return str;
}
