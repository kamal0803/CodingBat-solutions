def front_times(str, n):
  str1=""
  if len(str)<3:
    for i in range(n):
      str1=str1+str
  else:
    for i in range(n):
      str1=str1+str[:3]
  
  return str1
