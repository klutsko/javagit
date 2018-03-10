package module.task1.task1;

public class Exams {
    private String nameOfExam;

    public Exams(String nameOfExam) {
        this.nameOfExam = nameOfExam;
    }



    public String getNameOfExam() {
        return nameOfExam;
    }

    public void setNameOfExam(String nameOfExam) {
        this.nameOfExam = nameOfExam;
    }

    @Override
    public String toString() {
        return nameOfExam;
    }
}
