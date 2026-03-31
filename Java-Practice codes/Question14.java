class Person {
    void role() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("Manager");
    }
}

public class Question14 {
    public static void main(String[] args) {
        Person p=new Person();
        Person p1 = new Manager();
        Person p2=new Employee();
        p.role();
        p1.role();
        p2.role();
    }
}