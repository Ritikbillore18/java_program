class Leap_year
{
 public static void main(String args[])
 {
  int a=2022;
  if(a%400==0)
  {
   System.out.println("leap year");
  }
  else if(a%100==0)
  {
   System.out.println("Not leap Year");
  }
  else if(a%4==0)
  {
  System.out.println("Leap year");
  }
  else
  {
  System.out.println("Non Leap year");
  }
 }
}