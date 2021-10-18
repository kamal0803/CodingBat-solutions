/*

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
Otherwise, return the string unchanged.

delDel("adelbc") ? "abc"
delDel("adelHello") ? "aHello"
delDel("adedbc") ? "adedbc"
*/

public String delDel(String str) {
  
  if(str.indexOf("del")==1){
    String str1=str.replace("del","");
    return str1;
  }
  return str;
}
