public class UseCase1
{
   public static void main ( String args[] )
   {
      int checkNo=(int)(Math.floor(Math.random()*10)%2);
      int present=1;
      if ( checkNo == present )
         System.out.println("Employee is present...!");
      else
         System.out.println("Employee is absent...!");
   }
}
