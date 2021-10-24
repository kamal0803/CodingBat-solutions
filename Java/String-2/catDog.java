/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") ? true
catDog("catcat") ? false
catDog("1cat1cadodog") ? true
*/

public boolean catDog(String str) {
  int i,count_dog=0,count_cat=0;
  for(i=0;i<str.length()-2;i++){
    if((str.substring(i,i+3)).equals("cat"))
      count_cat++;
    if((str.substring(i,i+3)).equals("dog"))
      count_dog++;
  }
  return count_dog==count_cat;
}
