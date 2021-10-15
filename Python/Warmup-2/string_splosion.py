"""
Given a non-empty string like "Code" return a string like "CCoCodCode".

string_splosion('Code') → 'CCoCodCode'
string_splosion('abc') → 'aababc'
string_splosion('ab') → 'aab'

"""
def string_splosion(str):
  str1=""
  for i in range(len(str)):
    str1=str1+str[:i]
  return str1+str
