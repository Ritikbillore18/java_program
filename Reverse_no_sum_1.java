//write a program to summission of individual digite of a given no
class Reverse_no_sum_1
{
 public static void main(String args[])
 {
  int n=153,r,sum=0;
  while(n!=0)
  {
   r=n%10;
   sum=sum+r;
   n=n/10;
  } 
 System.out.print(sum);
 }
}