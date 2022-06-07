//Write a program to print a Fibonaci series 
class Fibonaci
{
 public static void main(String args[])
 {
 int a=0,b=1,c,i=1,n=7;
 System.out.print(a+""+b+"");
  while(i<=(n-2))
  {
   c=a+b;
   System.out.print(c+"");
   a=b;
   b=c;
   i++;
  }
 }
}
