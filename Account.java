import  java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    private  int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private  double savingBalance = 0;

    /* Set the customer number */

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    /* Get the customer number */

    public int getCustomerNumber() {
        return  customerNumber;
    }

    /* Set the pin number */

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    /* Get the pin number */

    public int getPinNumber() {
        return  pinNumber;
    }

    /* Get Checking Account Balance */

    public double getCheckingBalance() {
        return checkingBalance;
    }

    /* Get Saving Account Balance */

    public double getSavingBalance() {
        return savingBalance;
    }

    /* Calculate Checking Account Withdrawal */

    public void calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
    }

    /* Calculate Saving Account Withdrawal */

    public void calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
    }

    /* Calculate Checking Account Deposit */

    public void calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
    }

    /* Calculate Saving Account Deposit */

    public void calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
    }

    /* Customer Checking Account Withdraw Input */

    public void getCheckingWithdrawInput() {

        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = sc.nextDouble();

        if ((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Saving Account Withdraw Input */

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from Saving Account: ");
        double amount = sc.nextDouble();

        if ((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance) + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Checking Account Deposit Input */

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit from Checking Account: ");
        double amount = sc.nextDouble();

        if ((checkingBalance + amount) >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Saving Account Deposte Input */

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to Deposit into your Saving Account: ");
        double amount = sc.nextDouble();

        if ((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
}
