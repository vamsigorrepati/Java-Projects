import java.util.Scanner;
public class ManageAccounts
{
    public static void main(String[] args)
    {
        Account acct1, acct2;
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("What is the name for account 1");
        String acct1Name = scan.nextLine();
        System.out.println("What is the account balance");
        System.out.println("What is the account number");
        acct1 = new Account(scan.nextDouble(), acct1Name, scan.nextLong());
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is the name for account 2");
        String acct2Name = scan1.nextLine();
        System.out.println("What is the account balance");
        System.out.println("What is the account number");
        acct2 = new Account (scan1.nextDouble(), acct2Name, scan1.nextLong());
        
        System.out.println("How much do you want to deposit into account 2");
        acct2.deposit(scan.nextDouble());
        
        
        System.out.println(acct2Name +" new balance is " + acct2.getBalance());
        
        System.out.println("How much do you want to withdraw from account 1");
        acct1.withdraw(scan.nextDouble());
        
        
        System.out.println(acct1Name +" new balance is " + acct1.getBalance());
        
        
        System.out.println(acct1Name+"'s balance after charging a fee is " + acct1.chargerFee());
        System.out.println(acct2Name+"'s balance after charging a fee is " + acct2.chargerFee());
        
        System.out.println("What do you want to change account 2 name to?");
        acct2.changeName(scan.nextLine());
        
        
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
    }
}