import java.util.Scanner;
public class BankApplication {
    public static void main(String args[])
    {
        String usernamer;
        String userID;
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER USER NAME :");
        usernamer=scan.next();
        System.out.println("ENTER USER ID :");
        userID=scan.next();
        BankAccount b=new BankAccount();
        b.menu(usernamer, userID);
        scan.close();
    }
}
class BankAccount
{
    char ch;
    double previoustranscation;
    static double balance=0;
    Scanner s=new Scanner(System.in);
    void deposit(double amount)
    {
        if(amount>0)
          { 
            balance+=amount;
            previoustranscation=amount;
            System.out.println(amount+"  DEPOSITED INTO YOUR ACCOUNT");
          }
    }
    void withdraw(double amount)
    {
        if(amount<=balance)
        {
                balance-=amount;
            previoustranscation=-amount;
            System.out.println(amount +" WITHDRAWN FROM YOUR ACCOUNT ");
        }
        else{
            System.out.println(" WITHDRAW FAILED!");
        }
    }
    void previoustranscation()
    {
        if(previoustranscation>0)
        {
            System.out.println("DEPOSIT :"+previoustranscation);
        }
        else if(previoustranscation<0)
        {
            System.out.println("WITHDRAW :"+previoustranscation);
        }
        else
        {
            System.out.println("NO TRANSACTION ");
        }
    }
    void menu(String username,String userID)
    {
        System.out.println("WELCOME "+username);
        System.out.println("USER_ID is :"+userID);
        System.out.println();
        System.out.println("A . CHECK_BALANCE");
        System.out.println("B . DEPOSIT");
        System.out.println("C . WITHDRAW");
        System.out.println("D . PREVIOUS_TRANSACTION ");
        System.out.println("E . EXIT");
        do{
            System.out.println("ENTER AN OPTION FROM MENU :");
            ch=s.next().charAt(0);
            if(ch=='A')
            {
                System.out.println("BALANCE AMOUNT ="+balance);
            }
            else if(ch=='B')
            {
                System.out.println("ENTER AMOUNT TO DEPOSIT");
                double amount=s.nextDouble();
                deposit(amount);
            }
            else if(ch=='C')
            {
                System.out.println("ENTER AMOUNT TO WITHDRAW");
                double amount=s.nextDouble();
                withdraw(amount);
            }
            else if(ch=='D')
            {
                previoustranscation();
            }
            else if(ch=='E')
            {
                System.out.println("EXITING....");
                return;
            }
            else{
                System.out.println("ENTER APPROPIATE MENU OPTION !");
            }
        }while(ch!='E');
        s.close();
    }
}
