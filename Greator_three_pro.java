//write a program to find out maximum between three even number
//using Nessted ternary operator

class Greator_three_pro
{
 public static void main(String args[])
 {
  int a=10,b=20,c=30;
  a=a>b?(a>c?a:c):(b>c?b:c);
  System.out.println(a);
 }
}
