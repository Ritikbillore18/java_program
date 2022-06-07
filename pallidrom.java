//write a program to check that to given no is a pallidrom or is not
class Pallidrom 
{
 public static void main(String args[])
 {
  int n=151,r,sum=0,temp=n;
  while (n!=0)
  { 
   r=n%10;
   sum=sum*10+r;
   n=n/10; 
  }
  if(sum==temp)
  { 
   System.out.println("Pallidrome");
  }
  else
  {
   System.out.println("Not Pallidrome");
  }
 }
} 