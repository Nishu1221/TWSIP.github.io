import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int AccountNumber;
    private int PINnumber;
    private double CurrentBalance = 0;
    private double SavingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
        return AccountNumber;
    }
    
    public int getAccountNumber() {
       return AccountNumber;
    }

    public int setPINnumber(int PINnumber){
        this.PINnumber = PINnumber;
        return PINnumber;
    }

    public int getPINnumber(){
        return PINnumber;
    }

    public double getCurrentBalance(){
        return CurrentBalance;
    }

    public double getSavingBalance(){
        return SavingBalance;
    }

    public double calcCurrentWithdraw(double amount){
      CurrentBalance = (CurrentBalance - amount);
      return CurrentBalance;
    }
    public double calcSavingWithdraw(double amount){
        SavingBalance = (SavingBalance - amount);
        return SavingBalance;
      }
      public double calcCurrentDeposit(double amount){
        CurrentBalance = (CurrentBalance - amount);
        return CurrentBalance;
      }
      public double calcSavingDeposit(double amount){
        SavingBalance = (SavingBalance - amount);
        return SavingBalance;
      }
      public void getCurrentWithdrawInput(){
        System.out.println("Current Account Balance: " + moneyFormat.format(CurrentBalance));
        System.out.println("Amount you want to withdraw from current account : ");
        double amount = input.nextDouble();

        if((CurrentBalance - amount) >= 0){
            calcCurrentWithdraw(amount);
            System.out.println("New current account balance : " + moneyFormat.format(CurrentBalance));
        } else {
            System.out.println("Balance cannot be negative. " + "\n");
        }
      }
      public void getSavingWithdrawInput(){
        System.out.println("saving Account Balance: " + moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to withdraw from saving account : ");
        double amount = input.nextDouble();

        if((SavingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New saving account balance : " + moneyFormat.format(SavingBalance));
        } else {
            System.out.println("Balance cannot be negative. " + "\n");
        }
      }
      public void getCurrentDepositInput(){
        System.out.println("Current Account Balance: " + moneyFormat.format(CurrentBalance));
        System.out.println("Amount you want to withdraw from current account : ");
        double amount = input.nextDouble();

        if((CurrentBalance - amount) >= 0){
            calcCurrentWithdraw(amount);
            System.out.println("New current account balance : " + moneyFormat.format(CurrentBalance));
        } else {
            System.out.println("Balance cannot be negative. " + "\n");
        }
      }
      public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to withdraw from saving account : ");
        double amount = input.nextDouble();

        if((SavingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New saving account balance : " + moneyFormat.format(SavingBalance));
        } else {
            System.out.println("Balance cannot be negative. " + "\n");
        }
      }
}
