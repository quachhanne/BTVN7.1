public class Employee extends Person {
    private int salary;
    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public int setSalary(int salary){
        return this.salary = salary;
    }
    public void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee address: " + address);
        System.out.println("Employee salary: " + salary);
    }
}


