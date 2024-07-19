package Bank;

public class BankAccount {
    String accountHolderName;
    String bankName;
    double accountBalance;
    BankAccount(String accountHolderName,String bankName,double accountBalance ){
        this.accountHolderName=accountHolderName;
        this.bankName=bankName;
        this.accountBalance=accountBalance;
    }
    double getaccountBalance(){
        return accountBalance;
    }
    void deposit(double amt){
    if(amt>0){
        accountBalance=accountBalance+amt;
        System.out.println("money deposited : "+amt);
    }
    else
    {
        System.out.println("money is not deposited ");
    }
    }
    void withdraw(double amt){
        if(amt>0 && amt<=accountBalance){
            accountBalance=accountBalance-amt;
            System.out.println("money withdrew : "+amt);
        }
        else if(amt>accountBalance){
            System.out.println("money is not sufficient ");
        }
    }
    void display(){
        System.out.println("Account holder's name: "+accountHolderName);
        System.out.println("Bank name: "+bankName);
        System.out.println("Account Balance :"+accountBalance);
    }

    public static void main(String[] args) {
    BankAccount b1=new BankAccount("khushi","ICICI",1000);
    b1.deposit(5000);
    b1.withdraw(2000);
    b1.display();
    }

}
