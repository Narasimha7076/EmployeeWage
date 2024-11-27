public class Employee {
    String name;
    int id;
    boolean attendance = false;

    public void attendance(boolean a){
        if(a){
            attendance = true;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }

    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
}
