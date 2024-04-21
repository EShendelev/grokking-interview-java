package solid._1_singleResponsibility;

/**
 * <a href="https://nuancesprog.ru/p/18651/">Принципы SOLID</a>
 * Принцип единственной ответственности
 * Согласно этому принципу, класс должен меняться только по одной причине.
 * То есть у каждого модуля должно быть только одно назначение, отчего код становится удобнее
 * для восприятия и тестирования.
 * <p>
 * Задачи, связанные с управлением банковским счетом разделены на отдельные классы. Так, в случае необходимости
 * изменения, меняется только нужный класс.
 */
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

    public void depositMoney(BankAccount this, int amount) {
        this.depositManager.depositMoney(this, amount);
    }

    public void withdrawMoney(BankAccount this, int amount) throws Exception {
        this.withdrawalManager.withdrawMoney(this, amount);
    }

    public void printBalance(BankAccount this) {
        this.balancePrinter.printBalance(this);
    }

}
