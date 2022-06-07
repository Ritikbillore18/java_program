//write a program to print reverse of given no

class Reverse_no
{
 public static void main(String args[])
 {
  int n=153,r;
  while(n!=0)
  {
   r=n%10;
   System.out.println(r);
   n=n/10;
  }
 }
}