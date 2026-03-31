import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) {
            amount = 1.02f * amount;
        }
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        float amount = Compute();

        System.out.println("\nResort Details:");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: " + amount);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}