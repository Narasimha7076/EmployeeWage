public class Employee {
    String name;
    int id;
    boolean attendance = false;
    int normalWorkDay = 8;
    int dailySalary = 0;
    int salPerHour = 20;
    

    public void attendance(boolean a){
        if(a){
            attendance = true;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }

    public void calucatewage(boolean b1){
        if(attendance){
            dailySalary = normalWorkDay*salPerHour;
            System.out.println(dailySalary);
        }
        else {
            dailySalary=0;
            System.out.println(dailySalary);
        }
    }
    
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
}
