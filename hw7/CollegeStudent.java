package hw7;

public class CollegeStudent extends Student {
    int year;
    String major;

    public CollegeStudent(int year, String major) {
        super("UCB123,", 4.0);
        super.setName("Ima Frosh,");
        super.setGender("F");
        super.setAge(18);
        this.year = year;
        this.major = major;


    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

   @Override
    public String toString() {
        return (super.getName() + " age: " + super.getAge()  + " gender: " +
                super.getGender() + " student ID: " + idNumber + " gpa: " + super.getGpa() +
                " year "  + year + " major  "  +  major);

    }


}
