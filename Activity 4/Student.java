public class Student extends Person {
   
    private String gradeLevel;
    
    public Student(String name, int id, String gradeLevel) {
        super(name, id); // Call the constructor of the superclass (Person)
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Person)
        System.out.println("Grade Level: " + gradeLevel);
    }
}