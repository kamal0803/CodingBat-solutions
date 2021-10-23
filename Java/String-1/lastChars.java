/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") ? "ls"
lastChars("yo", "java") ? "ya"
lastChars("hi", "") ? "h@"
*/

public String lastChars(String a, String b) {
  String str1="";
  if(a.length()==0 && b.length()==0)
    str1=str1+"@@";
  else if(a.length()==0)
    str1=str1+"@"+b.charAt(b.length()-1);
  else if(b.length()==0)
    str1=str1+a.charAt(0)+"@";
  else
    str1=str1+a.charAt(0)+b.charAt(b.length()-1);
  return str1;
}
