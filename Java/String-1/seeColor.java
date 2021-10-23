/*
Given a string, if the string begins with "red" or "blue" return that color string, 
otherwise return the empty string.

seeColor("redxx") ? "red"
seeColor("xxred") ? ""
seeColor("blueTimes") ? "blue"
*/

public String seeColor(String str) {
  if(str.startsWith("red"))
    return "red";
  else if(str.startsWith("blue"))
    return "blue";
  else
    return "";
}