/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #03
 */

public class Company {

    private int number_of_employees;
    private String positions;
    private String manager;
    private String employees;
    private int depId;
    private double salary;

    public Company() {
        
    }

    public static void main(String[] args) {
        IT it = new IT();
        HR hr = new HR();
        Database x = Database.getInstance();

        System.out.println("Hashcode of IT object is: " + it.x.hashCode());
        System.out.println("Hashcode of HR object is: " + hr.x.hashCode());
        System.out.println("Hashcode of x object is: " + x.hashCode() + "\n");

        if (it.x == hr.x || hr.x == x) {

            // Print statement
            System.out.println("Three objects point to the SAME memory location on the heap i.e, to the same object");
        } else {
            // Print statement
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }

        it.x.text = it.x.text.toUpperCase();

        System.out.println("\n" + it.x.text);
        System.out.println(hr.x.text);
        System.out.println(x.text + "\n");

    }

    public void setNumber_of_employees(int number_of_employees) {
        this.number_of_employees = number_of_employees;
    }

    public int getNumber_of_employees() {
        return number_of_employees;
    }

    public String getPositions() {
        return positions;
    }

    public String getManager() {
        return manager;
    }

    public int getDepId() {
        return depId;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
