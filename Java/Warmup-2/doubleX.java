/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") ? true
doubleX("axaxax") ? false
doubleX("xxxxx") ? true
*/

boolean doubleX(String str) {
  
  int count=0,len=str.length(),flag=0;
  int i,j;
  for(i=0;i<len;i++){
    j=i+1;
    flag=0;
    if(str.charAt(i)=='x'){
      count=count+1;
      flag=1;
    }  
    if((i!=(len-1)) && flag==1 && str.charAt(j)=='x' && count==1){
      return true;
    }
  }
  return false;
  
}
