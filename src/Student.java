import java.util.ArrayList;

/**
 * The Student class represents a student's information including their name, subjects, and grades.
 */
public class Student {

    // Private instance variables to store the state of the Student
    private String name;                   // Name of the student
    private ArrayList<String> subject;     // List of subjects
    private ArrayList<Character> grade;    // List of grades for corresponding subjects

    /**
     * Constructor to create a student with a given name.
     *
     * @param newName The name of the student.
     */
    public Student(String newName) {
        this.name = newName;
        this.subject = new ArrayList<String>();
        this.grade = new ArrayList<Character>();
    }

    /**
     * Get the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Add a subject and its corresponding grade to the student's record.
     *
     * @param s The name of the subject.
     * @param g The grade received for the subject.
     */
    public void add(String s, Character g) {
        subject.add(s);
        grade.add(g);
    }

    /**
     * Get the list of subjects the student is enrolled in.
     *
     * @return A list of subjects.
     */
    public ArrayList<String> getSubjects() {
        return subject;
    }

    /**
     * Calculate and return the student's GPA based on their grades.
     *
     * @return The GPA (Grade Point Average) of the student.
     */
    public double getGPA() {
        double totalPoint = 0.0;
        for (char g : grade) {
            switch (g) {
                case 'A':
                    totalPoint += 4.0;
                    break;
                case 'B':
                    totalPoint += 3.0;
                    break;
                case 'C':
                    totalPoint += 2.0;
                    break;
                case 'D':
                    totalPoint += 1.0;
                    break;
                case 'F':
                    totalPoint += 0.0;
                    break;
            }
        }
        return totalPoint / grade.size();
    }
}
