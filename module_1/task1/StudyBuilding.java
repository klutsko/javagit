package module.task1.task1;

public class StudyBuilding {
    public static void main(String[] args) {
        int markForPassing =4;
        Student student = new Student("Tom", "Bom");
        Teacher teacher = new Teacher("John");

        student.registration(new Faculty("Historical"));
        student.passingExams(new Exams("History"));
        student.passingExams(new Exams("Math"));
        teacher.putMark(student, new Mark("Three") );
        teacher.putMark(student, new Mark("Four"));






    }
    static Mark avg (Mark mark){
        return  mark;
    }
}
