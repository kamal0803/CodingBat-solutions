"""
Return the number of times that the string "code" appears anywhere in the given string, 
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

count_code('aaacodebbb') → 1
count_code('codexxcode') → 2
count_code('cozexxcope') → 2

"""

def count_code(str):
  count=0
  for i in range(len(str)):
    if i+3<len(str) and str[i:i+2]=="co" and str[i+2]>="a" and str[i+2]<="z" and str[i+3]=="e":
      count=count+1
  return count