import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello, World!");
        Employee e1 = new Employee("Ram",123);
        Random r = new Random();
        int i = (r.nextInt(1000))%2;
        System.out.println(i);
        switch (i){
            case 1-> e1.attandance(true);
            default-> e1.attandance(false);
        }
    }
}