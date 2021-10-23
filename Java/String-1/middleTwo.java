/*

Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". 
The string length will be at least 2.

middleTwo("string") ? "ri"
middleTwo("code") ? "od"
middleTwo("Practice") ? "ct"
*/

public String middleTwo(String str) {
  String str1="";
  if(str.length()%2==0){
    str1=str1+str.charAt(str.length()/2-1)+str.charAt(str.length()/2);
  }
  else{
    str1=str1+str.charAt(str.length()/2)+str.charAt(str.length()/2+1);
  }
  return str1;
}
