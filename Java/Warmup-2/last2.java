/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, 
so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") ? 1
last2("xaxxaxaxx") ? 1
last2("axxxaaxx") ? 2
*/

public int last2(String str) {
  if(str.length()<=2)
    return 0;
  String str1=str.substring(str.length()-2, str.length());
  String x="";
  int c=0;
  for(int i=0;i<str.length();i++){
    x="";
    if(i+2<str.length()){
      x=str.substring(i,i+2);
    }
    if(x.equals(str1)){
      c++;
    }
  }
  return c;
}
  
