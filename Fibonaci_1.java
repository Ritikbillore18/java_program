//Write a program to print a Fibonaci series 
class Fibonaci_1
{
 public static void main(String args[])
 {
 int a=0,b=1,c,i=1,n=7;
  while(i<=n)
  {
   c=a+b;
   System.out.print(a+"");
   a=b;
   b=c;
   i++;
  }
 }
}
