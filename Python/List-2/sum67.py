"""
Return the sum of the numbers in the array, 
except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). 
Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4

"""

def sum67(nums):
  sum=0
  flag=0
  for i in range(len(nums)):
    if nums[i]!=6 and flag==0:
      sum=sum+nums[i]
    elif nums[i]==6:
      flag=1
    elif nums[i]==7:
      flag=0
  return sum
