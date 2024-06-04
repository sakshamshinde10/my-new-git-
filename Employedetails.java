interface Allowance {
    
    double da = 0.9 * basicsalary;
    double hra = 0.1 * basicsalary;
    double pf = 0.8333 * basicsalary;

    void netSalary();
}

class Salary {
    int empid;
    String name;

    Salary(int i, String n, float b) {
        empid = i;
        name = n;
        basicsalary = b;
    }

    void display() {
        System.out.println("Employee id is:" + empid);
        System.out.println("Name is:" + name);
        System.out.println("Salary is:" + basicsalary);
    }
}

class net_salary extends Salary implements Allowance {
    float ta;

    net_salary(int i, String n, float b, float t) {
        super(i, n, b);
        ta = t;
    }

    void disp() {
        display();
        System.out.println("da of employee:" + da);
    }

    public void netsalary() {
        double netsal = basicsalary + da + hra + ta - pf;
        System.out.println("Net salary of employee is:" + netsal);
    }
}

class Employedetails {
    public static void main(String[] args) {
        net_salary s = new net_salary(149, "Saksham", 50000);
        s.disp();
        s.netsalary();
    }
}
