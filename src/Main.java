import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello, World!");
        Employee e1 = new Employee("Ram",123);
        Random r = new Random();
        int i = (r.nextInt(1000))%3;
        System.out.println(i);
        switch (i){
            case 1-> e1.attendance(true);
            case 2->
            {
                e1.attendance(true);
                System.out.println("Part Time");
                e1.normalWorkDay = 4;
            }
            default-> e1.attendance(false);
        }
        e1.calucatewage();
    }
}