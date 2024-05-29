import java.util.Scanner;

class simpleCalculator
{
    public static void main(String[] args)
    {
        int operators, n1,n2;
        System.out.println("1-Addition \n 2-Substaction \n 3-Multiplication\n 4-Division");
        System.out.println("Choose Operator : ");
        Scanner sc=new Scanner(System.in);
        operators=sc.nextInt();
        System.out.println("Enter First Number : ");
        n1=sc.nextInt();
        System.out.println("Enter Second Number : ");
        n2=sc.nextInt();

        int result=0;
        switch(operators)
        {
            case 1:
            result=n1+n2;
            break;
            case 2:
            result=n1-n2;
            break;
            case 3:
            result=n1*n2;
            break;
            case 4:
            result=n1/n2;
            break;
            default:
            System.out.println("Enter operator is not valid");
            
        }
            System.out.println("Result :"+result);

    }
}