/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") ? "CCoCodCode"
stringSplosion("abc") ? "aababc"
stringSplosion("ab") ? "aab"
*/

public String stringSplosion(String str) {
  String str1="";
  for(int i=0;i<str.length();i++){
    str1=str1+str.substring(0, i);
  }
  return str1+str;
}
