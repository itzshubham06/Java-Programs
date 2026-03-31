interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

public class Question10 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Bank Intrest:"+b1.getInterestRate());
        System.out.println("HDFC Bank Intrest:"+b2.getInterestRate());
        System.out.println("ICICI Bank Intrest:"+b3.getInterestRate());
    }
}