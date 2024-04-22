package solid._1_singleResponsibility;

public class BankAccount {
    private int balance;
    private int id;
    private BalancePrinter balancePrinter;
    private DepositManager depositManager;
    private WithdrawalManager withdrawalManager;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositMoney(int amount) {
        depositManager.depositMoney(this, amount);
    }

    public void withdrawMoney(int amount) throws Exception {
        withdrawalManager.withdrawMoney(this, amount);
    }

    public void printBalance() {
        balancePrinter.printBalance(this);
    }

}
