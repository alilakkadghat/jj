package maths;
import java.util.*;
class lucky_boi
{
    public static void main()
    {
        int i;
        for(i=1;i<=5;i++)
        {
        Scanner obj =new Scanner(System.in);
      System.out.println("Enter your lucky No Between 1-6");
  int a=obj.nextInt();
  long x =Math.round(Math.random()*6);
  if (a==x)
  {
  System.out.println("You are a lucky person");
}
  else{
    System.out.println("Better luck next Time");
  System.out.println("The lucky No was"+"             "+x);
}
}
}
}