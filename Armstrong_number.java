// Write a program to check that the given no is an armstring no or not armstrong no

class Armstrong_number
{
 public static void main(String args[])
 {
  int n=153,r,sum=0,temp=n;
   while(n!=0)
   {
    r=n%10;
    sum=sum+(r*r*r);
    n=n/10;
   }
  if(sum==temp)
  {
   System.out.print("Armstrong Number:");
  }
  else
  { 
   System.out.print("Not a Aemstrong Number");
  }
 System.out.print(sum);
 }
} 