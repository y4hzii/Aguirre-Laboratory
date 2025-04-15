public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //constructor
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public class SchoolTest{
        public static void main(String[] args) {
            
            System.out.println("School Information System\n");

            System.out.println("Student Information: \n");
            Student student = new Student("Wang Womp", 101202303, "10th Grade");
            student.displayInfo();
            System.out.println("\n");

            System.out.println("Teacher Information: \n");
            Teacher teacher = new Teacher("Riza Ayiza", 2345787, "History");
            teacher.displayInfo();
            System.out.println("\n");

            System.out.println("Staff Information: \n");
            Staff staff = new Staff("Jane Margarita", 2345787, "Administration");
            staff.displayInfo();
            System.out.println("\n");

        } 
 }
}