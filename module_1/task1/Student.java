package module.task1.task1;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void registration(Faculty faculty) {
        System.out.println("Student is checking in to Faculty");


    }
    void passingExams(Exams exams){
        System.out.println("Student is passing exam for " + exams);
    }
}
