/*
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) ? "ChocChoChC"
repeatFront("Chocolate", 3) ? "ChoChC"
repeatFront("Ice Cream", 2) ? "IcI"
*/

public String repeatFront(String str, int n) {
  String str1="";
  for(int i=0;i<n;i++){
    str1=str1+str.substring(0,n-i);
  }
  return str1;
}
