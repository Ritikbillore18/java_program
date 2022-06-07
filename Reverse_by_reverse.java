class Reverse_by_reverse
{
 public static void main(String args[])
 {
  int i=153,n,sum=0;
  while(i!=0)
  {
   n=i%10;
   sum=sum*10+n;
   i=i/10;
  }
  System.out.println(sum);
  while(sum!=0)
  {
  n=sum%10;
  i=i*10+n;
  sum=sum/10;
  }
  System.out.println(i);
 }
}
