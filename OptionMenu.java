import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner MenuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer , Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do{
            try{
                data.put(951217, 856321);
                data.put(563248, 632489);

                System.out.println("Welcome to My ATM");
                System.out.println("Enter your Account Number");
                setAccountNumber(MenuInput.nextInt());

                System.out.println("Enter your PIN");
                setPINnumber(MenuInput.nextInt());
            }  catch  (Exception e) {
                System.out.println("/n" + "Invalid Character(s). Only Numbers." + "/n");
                x = 2;
            }
            int cn = getAccountNumber();
            int pn = getPINnumber();
            if(data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            }else
            System.out.println("/n" + "Wrong Account Number or PIN number" + "/n");
          } while(x == 1);
        }            
          public void getAccountType(){
           System.out.println("Select Account you want acccess");
           System.out.println("Type 1 - Current Account");
           System.out.println("Type 2 - Saving Account");
           System.out.println("Type 3 - Exit");

           int selection = MenuInput.nextInt();

           switch (selection) {
            case 1:
            getCurrent();
            break; 

            case 2: 
            getSaving();
            break;

            case 3:
            System.out.println("Thank you for using this ATM,  bye. \n");
            break;

            default:
            System.out.println("/n" + "Invalid Character." + "\n");
            getAccountType();
              }
            }
            public void getCurrent(){
                System.out.println("Current Account: ");
                System.out.println("Type 1 - View Balance");
                System.out.println("Type 2 - withdraw Funds");
                System.out.println("Type 3 - Deposit Funds");
                System.out.println("Type 4 - Exit");
                System.out.println("Choice:");

                int selection = MenuInput.nextInt();

                switch (selection) {
                    case 1: 
                    System.out.println("Current Account Balance: " + moneyFormat.format(getCurrentBalance()));
                    getAccountType();
                    break;

                    case 2: 
                    getCurrentWithdrawInput();
                    getAccountType();
                    break;

                    case 3: 
                    getCurrentDepositInput();
                    getAccountType();
                    break;

                    case 4:
                     System.out.println("Thank you for using this ATM, bye.");
                     break;

                     default:
                     System.out.println("/n" + "Invalid Character." + "\n");
                     getCurrent();
                     break;
                }
            }
            public void getSaving(){
                System.out.println("saving Account: ");
                System.out.println("Type 1 - View Balance");
                System.out.println("Type 2 - withdraw Funds");
                System.out.println("Type 3 - Deposit Funds");
                System.out.println("Type 4 - Exit");
                System.out.println("Choice:");

                int selection = MenuInput.nextInt();

                switch (selection) {
                    case 1: 
                    System.out.println("saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                    getAccountType();
                    break;

                    case 2: 
                    getSavingWithdrawInput();
                    getAccountType();
                    break;

                    case 3: 
                    getSavingDepositInput();
                    getAccountType();
                    break;

                    case 4:
                     System.out.println("Thank you for using this ATM, bye.");
                     break;

                     default:
                     System.out.println("/n" + "Invalid Character." + "\n");
                     getSaving();
                     break;
             }
          
    }
}


