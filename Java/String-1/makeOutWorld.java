/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". 

makeOutWord("<<>>", "Yay") ? "<<Yay>>"
makeOutWord("<<>>", "WooHoo") ? "<<WooHoo>>"
makeOutWord("[[]]", "word") ? "[[word]]"
*/

public String makeOutWord(String out, String word) {
  return out.substring(0,2)+word+out.substring(2,4);
}
