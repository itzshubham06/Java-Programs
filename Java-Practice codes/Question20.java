class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name:"+name + " \n"+"Salary:" + salary);
    }
}

public class Question20 {
    public static void main(String[] args) {
        Employee e = new Employee("Shubham", 50000);
        e.display();
    }
}