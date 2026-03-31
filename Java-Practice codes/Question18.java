class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }
}

public class Question18 {
    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println(b.calculateInterest(10000));
        System.out.println(b.calculateInterest(20000));
    }
}