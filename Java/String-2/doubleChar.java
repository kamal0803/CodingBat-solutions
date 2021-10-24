/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") ? "TThhee"
doubleChar("AAbb") ? "AAAAbbbb"
doubleChar("Hi-There") ? "HHii--TThheerree"
*/

public String doubleChar(String str) {
  String str1="";
  for(int i=0;i<str.length();i++){
    str1=str1+str.charAt(i)+str.charAt(i);
  }
  return str1;
}
