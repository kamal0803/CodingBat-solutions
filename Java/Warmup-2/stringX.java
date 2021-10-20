/*
Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") ? "xHix"
stringX("abxxxcd") ? "abcd"
stringX("xabxxxcdx") ? "xabcdx"
*/

public String stringX(String str) {

  StringBuilder str1=new StringBuilder(str);
		int i,len=str.length();
		for(i=1;i<len-1;i++) {
			if(str1.charAt(i)=='x') {
				str1.deleteCharAt(i);
				len--;
				i--;
			}
		}
  return str1.toString();
}
