package module.task1.task1;

public class Teacher extends  Exams {
    private String name;

    public Teacher(String name) {
        super("Default");
        this.name = name;
    }

    void putMark(Student student, Mark mark){
        System.out.println("Teacher is putting  mark " + mark +  " for exam"  );

    }

}
