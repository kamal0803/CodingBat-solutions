Given a non-negative number "num", return True if num is within 2 of a multiple of 10. 

near_ten(12) → True
near_ten(17) → False
near_ten(19) → True

def near_ten(num):
  
  for i in range(0,3):
    if (num+i)%10==0 or (num-i)%10==0:
      return True
      
  return False

