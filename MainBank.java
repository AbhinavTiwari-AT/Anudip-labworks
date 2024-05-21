package methodoveriding_module12;


class BankAccount{
	protected double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance +=amount;
			System.out.println("Deposited: " + amount);
		}else {
			System.out.println("Deposit amount must be positive");		
		}
	}

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }
    

    public double getBalance() {
        return balance;
    }
    
}

class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= WITHDRAWAL_LIMIT && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from SavingsAccount: " + amount);
        } else if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal limit exceeded. Maximum allowed is " + WITHDRAWAL_LIMIT);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 2.5;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (amount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrawn from CheckingAccount: " + amount + " (including fee: " + TRANSACTION_FEE + ")");
        } else {
            System.out.println("Insufficient balance or invalid withdraw amount");
        }
    }
}

public class MainBank {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount checking = new CheckingAccount(1000);

        System.out.println("Initial SavingsAccount Balance: " + savings.getBalance());
        savings.deposit(300);
        savings.withdraw(100);
        savings.withdraw(550);  // Exceeds withdrawal limit
        System.out.println("Final SavingsAccount Balance: " + savings.getBalance());

        System.out.println("\nInitial CheckingAccount Balance: " + checking.getBalance());
        checking.deposit(200);
        checking.withdraw(100);
        checking.withdraw(1200);  // Insufficient balance after including transaction fee
        System.out.println("Final CheckingAccount Balance: " + checking.getBalance());
    }
}



