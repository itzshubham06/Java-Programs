class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Treating patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Assisting doctors");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Managing front desk");
    }
}

public class Question16 {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}