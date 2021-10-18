"""
Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. 
So for example, if b is 13, then both b and c do not count.

lucky_sum(1, 2, 3) → 6
lucky_sum(1, 2, 13) → 3
lucky_sum(1, 13, 3) → 1

"""

def lucky_sum(a, b, c):
  list_num=[]
  list_num.insert(0,a)
  list_num.insert(1,b)
  list_num.insert(2,c)
  sum=0
  for i in range(len(list_num)):
    if list_num[i]!=13:
      sum=sum+list_num[i]
    else:
      return sum
  return sum
