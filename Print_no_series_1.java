//write a program  to print following series of no in (i/i*i) form 
class Print_no_series_1
{
 public static void main(String args[])
 {
  int i=1;
  System.out.println("your no series:");
  while(i<=10)
  {
   System.out.print(i+"/"+(i*i)+" + " );
   i++;
  }
  System.out.print(i+"/"+(i*i));
 }
}