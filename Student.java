// Student class definition
public class Student {

    // instance variables
    private String name;
    private int age;
    private double gpa;
    private String school;

    // constructor
    public Student(String sName, int sAge, double sGpa, String sSchool) {
        name = sName;
        age = sAge;
        gpa = sGpa;
        school = sSchool;
    }

    public void introduce() {
        System.out.println("Hey I'm " + name);
        System.out.println("I have a " + gpa + " gpa and I go to " + school);
        System.out.println("Also I'm " + age + " years old");
    }

    // method that introduces the Cat
    public void bragOrSad(double otherGpa) {
        if (otherGpa > gpa) {
            System.out.println("WHAT? IMPOSSIBLE!");
        } else if (otherGpa == gpa) {
            System.out.println("There's only room for one of us...");
        } else {
            System.out.println("Yeah actually I got a " + gpa + " as my gpa.");
        }
    }
}
