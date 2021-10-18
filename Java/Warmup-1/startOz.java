/*

Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") ? "oz"
startOz("bzoo") ? "z"
startOz("oxx") ? "o"

*/

public String startOz(String str) {
  String str1="";
  if(str.length()==0){
    return str1;
  }
  else if(str.equals("o") || str.equals("z"))
    return str;
  else if((str.substring(0,2)).equals("oz")){
    str1="oz";
  }
  else if((str.substring(0,1)).equals("o")){
    str1="o";
  }
  else if((str.substring(1,2)).equals("z")){
    str1="z";
  }
  return str1;
}
