/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) ? "H"
theEnd("Hello", false) ? "o"
theEnd("oh", true) ? "o"
*/

public String theEnd(String str, boolean front) {
  String str1="";
  if(front==true)
    str1=str1+str.charAt(0);
  else
    str1=str1+str.charAt(str.length()-1);
  return str1;
}
