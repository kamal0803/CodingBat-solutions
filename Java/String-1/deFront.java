/*
Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") ? "llo"
deFront("java") ? "va"
deFront("away") ? "aay"
*/



public String deFront(String str) {    
  
  if(str.charAt(0)=='a' && str.charAt(1)=='b') return str;
  else if(str.charAt(0)!='a' && str.charAt(1)!='b') return str.substring(2,str.length());
  else if(str.charAt(0)=='a')
  {
    String str1="";
    str1=str1+str.charAt(0);
    return str1+str.substring(2,str.length());
  }
  else 
  {
    return str.substring(1,str.length());
  }
}