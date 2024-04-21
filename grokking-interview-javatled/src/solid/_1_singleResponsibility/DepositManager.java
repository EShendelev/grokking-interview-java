package solid._1_singleResponsibility;

public class DepositManager {
    void depositMoney(BankAccount bankAccount, int amount) {
        int balance = bankAccount.getBalance();
        bankAccount.setBalance(balance + amount);
    }
}
