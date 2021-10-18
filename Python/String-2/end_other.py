"""
Given two strings, return True if either of the strings appears at the very end of the other string, 
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: s.lower() returns the lowercase version of a string.

end_other('Hiabc', 'abc') → True
end_other('AbC', 'HiaBc') → True
end_other('abc', 'abXabc') → True

"""

def end_other(a, b):
  
  a=a.lower()
  b=b.lower()
  len_a=len(a)
  len_b=len(b)
  
  if len_a>=len_b:
    if a[len_a-len_b:]==b:
      return True
    else:
      return False
  else:
    if b[len_b-len_a:]==a:
      return True
    else:
      return False
