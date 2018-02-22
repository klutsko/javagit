package hw7;

public class Main {
    public static void main(String[] args) {
    Person person = new Person("Ksenia", 26, "F");
    Student student = new Student("HS95144", 4.5);
    Teacher teacher = new Teacher("Computer Science", 50000.0);
    CollegeStudent collegeStudent = new CollegeStudent(1, "English");

    Person [] arr = {person, student, teacher, collegeStudent};

    for(Person x: arr){
        System.out.println(x);
    }



    }
}

