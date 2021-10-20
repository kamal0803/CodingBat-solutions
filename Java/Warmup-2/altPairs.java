/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") ? "kien"
altPairs("Chocolate") ? "Chole"
altPairs("CodingHorror") ? "Congrr"
*/

public String altPairs(String str) {
  int t=str.length();
  String s1="";
  int i,j;
  for(i=0,j=1;i<t && j<t;i=i+4,j=j+4){
    s1=s1+str.charAt(i)+str.charAt(j);
  }
  while(i<t){
    s1=s1+str.charAt(i);
    i=i+4;
  }
  while(j<t){
    s1=s1+str.charAt(j);
    j=j+4;
  }
  return s1;
}
