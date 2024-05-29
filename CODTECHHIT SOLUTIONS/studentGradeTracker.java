import java.util.Scanner;

public class studentGradeTracker {
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your Roll Number : ");
       int rno=sc.nextInt();
       System.out.println("Enter your Name : ");
       String name=sc.nextLine();

       System.out.println("Enter the mark of Pyshics : ");
       int phy=sc.nextInt();
       
       System.out.println("Enter the mark of Chemestry : ");
       int chem=sc.nextInt();

       System.out.println("Enter the mark of Biology : ");
       int bio=sc.nextInt();

       System.out.println("Enter the mark of Mathmatics: ");
       int math=sc.nextInt();

       System.out.println("Enter the mark of Computer Science : ");
       int cs=sc.nextInt();

       int total=phy+chem+bio+math+cs;
       int avg=total/5;
       System.out.println("Your mark is : "+total);
       System.out.println("Your Average or Percentage is :" +avg+"%");

       if(avg>=80)
       {
        System.out.println("Your Grade is A");
       }
       else if(avg>=70)
       {
        System.out.println(("Your Grade is B"));
       }
       else if(avg>=60)
       {
        System.out.println(("Your Grade is C"));
       }
       else if(avg>=50)
       {
        System.out.println(("Your Grade is D"));
       }
       else if(avg>=0)
       {
        System.out.println(("Your Grade is F"));
       }
       else
       {
        System.out.println("Please Check Again ");
       }






    }
}
