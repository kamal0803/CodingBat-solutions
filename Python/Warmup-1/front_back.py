"""
Given a string, return a new string where the first and last chars have been exchanged.

front_back('code') → 'eodc'
front_back('a') → 'a'
front_back('ab') → 'ba'

"""

def front_back(str):
  if len(str)>2:
    first=str[0]
    last=str[len(str)-1]
    return last+str[1:len(str)-1]+first
  elif len(str)==2:
    return str[::-1]
  else:
    return str