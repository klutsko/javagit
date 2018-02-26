package HW4;

public class HW4_4 {
    public static void main(String[] args) {




        int h1, h2, m1, m2;
        int hours = 0;
        int minutes = 0;
        int count = 0;

        while (hours < 24) {
            h1 = hours / 10;
            h2 = hours % 10;
            m1 = minutes / 10;
            m2 = minutes % 10;
            if (h1 == m1 && h2 == m2) {
                count++;
            }
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
        }
        System.out.println("We can see the same combination: " + count + "times");

    }
}
