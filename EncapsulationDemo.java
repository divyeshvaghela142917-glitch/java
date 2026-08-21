
class Employee {
    // Private data members
    private int id;
    private String name;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values
        emp.setId(101);
        emp.setName("Rahul");

        // Displaying values
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}