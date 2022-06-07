//write a program to print a revese of a given no and sum of the no 

class Revese_no_sum
{
 public static void main(String args[])
 {
  int n=153,sum=0,r;
  while(n!=0)
  {
   r=n%10;
   sum=sum*10+r;
   n=n/10;
  }
 System.out.print(sum);
 } 
}