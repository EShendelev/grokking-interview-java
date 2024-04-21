package solid._1_singleResponsibility;

public class WithdrawalManager {
    public void withdrawMoney(BankAccount bankAccount, int amount) throws Exception {
        int balance = bankAccount.getBalance();
        if (amount > balance) {
            throw new Exception("There is not enough money");
        } else {
            bankAccount.setBalance(balance - amount);
        }
    }
}
