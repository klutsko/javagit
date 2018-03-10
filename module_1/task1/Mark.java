package module.task1.task1;

public class Mark {
    private String mark;

    public Mark(String mark) {
        this.mark = mark;

    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return getMark();
    }
}
