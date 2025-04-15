public class Staff extends Person {
    private String department;
    
    public Staff(String name, int id, String department) {
        super(name, id); // Call the constructor of the superclass (Person)
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Person)
        System.out.println("Department: " + department);
    }
}