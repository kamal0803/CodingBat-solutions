/*
Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. 
Return a new String[] array containing the string form of these numbers, except for multiples of 3, 
use "Fizz" instead of the number, 
for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". 
In Java, String.valueOf(xxx) will make the String form of an int or other type. 

fizzBuzz(1, 6) ? ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) ? ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) ? ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
*/

public String[] fizzBuzz(int start, int end) {
  String[] new_str=new String[end-start];
  int dup_start=start;
  for(int i=0;i<end-start;i++){
    if(dup_start%15==0)
      new_str[i]="FizzBuzz";
    else if(dup_start%5==0)
      new_str[i]="Buzz";
    else if(dup_start%3==0)
      new_str[i]="Fizz";
    else
      new_str[i]=String.valueOf(dup_start);
    dup_start++;
  }
  return new_str;
}
