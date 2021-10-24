/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. 
Any leftover chars go at the end of the result.

mixString("abc", "xyz") ? "axbycz"
mixString("Hi", "There") ? "HTihere"
mixString("xxxx", "There") ? "xTxhxexre"
*/

public String mixString(String a, String b) {
  int i,j;
  String str1="";
  for(i=0,j=0;i<a.length() && j<b.length();i++,j++){
    str1=str1+a.charAt(i)+b.charAt(j);
  }
  while(i<a.length()){
    str1=str1+a.charAt(i);
    i++;
  }
  while(j<b.length()){
    str1=str1+b.charAt(j);
    j++;
  }
  return str1;
}
