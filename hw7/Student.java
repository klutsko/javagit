package hw7;

public class Student extends Person {
      String idNumber;
    private double gpa;

    public Student(String idNumber, double gpa) {
       super("Lynne Brooke,", 16   ,"F");
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  super.getName()  + " age: " + super.getAge()  + " gender: " +
                super.getGender() + " student ID: " + idNumber + " gpa: " + gpa;
    }
}
