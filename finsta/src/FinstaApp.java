import in.skillverse.finsta.User;
import in.skillverse.finsta.Account;
import java.io.*;

public class FinstaApp {
    Account accounts[] = new Account[100];
    Account defaultAccount = new Account();
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public static void main(String args[]) {
        int action;
        while(true){

            System.out.println("Personal Accounting App");
            System.out.println("1.Add Account");
            System.out.println("2.View all Acounts");
            try {
                action = Integer.parseInt(br.readLine());
                switch (action) {
                    case 1:
                    addAccount();
                    break;
                    case 2:
                    viewAllAccounts();
                    break;
                    
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void viewAllAccounts() {
        System.out.println("Account Number       Name of Account     Category");
        for (Account account : accounts) {
            if(account.accountNumber!=0){
                System.out.println(account.accountNumber+" "+account.accountName+" "+account.category);
            }
        }
    }

    private static void addAccount() {
        int acno;
        Account ac=new Account();
        System.out.println("Enter Account Details");
        System.out.println("Account Number:");
        try {
            acno = br.read();
            ac.accountNumber=acno;
            System.out.println("Account Name:");
            ac.accountName=br.readLine();
            System.out.println("Category");
            ac.category=br.readLine();
            accounts[acno]=ac;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }

    
}