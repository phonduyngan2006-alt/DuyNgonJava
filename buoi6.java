import java.util.ArrayList;

abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return "Name: " + name
                + "\nAddress: " + address
                + "\nPhone: " + phone;
    }

    public abstract double pay();
}

class Volunteer extends StaffMember {

    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    public double pay() {
        return 0.0;
    }
}

class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone,
                    String ssn, double rate) {
        super(name, address, phone);
        this.socialSecurityNumber = ssn;
        this.payRate = rate;
    }

    public double pay() {
        return payRate;
    }

    public String toString() {
        return super.toString()
                + "\nSSN: " + socialSecurityNumber;
    }
}

class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone,
                     String ssn, double rate) {
        super(name, address, phone, ssn, rate);
        bonus = 0;
    }

    public void awardBonus(double execBonus) {
        bonus += execBonus;
    }

    public double pay() {
        return payRate + bonus;
    }
}

class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phone,
                  String ssn, double rate) {
        super(name, address, phone, ssn, rate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    public String toString() {
        return super.toString()
                + "\nHours Worked: " + hoursWorked;
    }
}

class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<>();

        Executive e1 = new Executive(
                "Nguyen Van A",
                "Ha Noi",
                "0123456789",
                "111-11-1111",
                5000);

        e1.awardBonus(2000);

        Hourly h1 = new Hourly(
                "Tran Van B",
                "Da Nang",
                "0987654321",
                "222-22-2222",
                100);

        h1.addHours(40);

        Volunteer v1 = new Volunteer(
                "Le Thi C",
                "TP HCM",
                "0333444555");

        staffList.add(e1);
        staffList.add(h1);
        staffList.add(v1);
    }

    public void payday() {
        for (StaffMember sm : staffList) {

            System.out.println("----------------------");
            System.out.println(sm);

            double amount = sm.pay();

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }
        }
    }
}

public class buoi6 {
    public static void main(String[] args) {

        Staff personnel = new Staff();
        personnel.payday();

    }
}