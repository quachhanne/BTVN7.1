public class Customer extends Person {
    private int balance;
    public Customer(String name, String address, int balance){
       super(name,address);
       this.balance = balance;
    }
    public void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee address: " + address);
        System.out.println("Employee salary: " + balance);
    }
}
