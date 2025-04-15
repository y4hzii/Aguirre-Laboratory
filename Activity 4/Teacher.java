public class Teacher extends Person{
    private String subject;
    
    public Teacher(String name, int id, String subject) {
        super(name, id); // Call the constructor of the superclass (Person)
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Person)
        System.out.println("Subject: " + subject);
    }
}