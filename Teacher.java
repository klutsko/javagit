package hw7;

public class Teacher extends Person {
    double salary;
    String subject;

    public Teacher(String subject,double salary) {
       super("Duke Java,", 34, "M");
       /* super.setName("Default");
        super.setAge(0);
        super.setGender("F");*/
        this.subject = subject;
        this.salary = salary;



    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.getName() + " age: " + super.getAge()  +
                " gender: " +  super.getGender() +  " subject: " + subject + " salary " + salary;
    }


}