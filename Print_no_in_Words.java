class Print_no_in_Words
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
  System.out.print(n+":");
  switch(n)
  {
   case 1: System.out.println("One");break;
   case 2: System.out.println("Two");break;
   case 3: System.out.println("Three");break;
   case 4: System.out.println("Four");break;
   case 5: System.out.println("Five");break;
   case 6: System.out.println("Six");break;
   case 7: System.out.println("Seven");break;
   case 8: System.out.println("Eight");break;
   case 9: System.out.println("Nine"); break;
  // default :System.out.println("Invalid input");
  }
  sum=sum/10;
  }
 }
}