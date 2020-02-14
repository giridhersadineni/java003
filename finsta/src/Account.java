package in.skillverse.finsta;
public class Account{
public int userId;
public int accountNumber;
public String accountName;
public String category;
public String tag;
public int balance;

public int getAccountBalance(){
return this.balance;
}

public Account(){
    this.accountNumber=0;
}

public boolean isOverdue(){
 if(this.balance<0){
 return true;
}
return false;
} 

}