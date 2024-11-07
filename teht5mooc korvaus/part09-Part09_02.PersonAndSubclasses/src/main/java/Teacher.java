public class Teacher extends Person{
    private int salary;

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getName() + "\n  "+getAddress()+ "\n  salary " + salary + " euro/month";
    }
}
