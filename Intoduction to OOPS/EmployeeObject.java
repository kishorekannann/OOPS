
public class EmployeeObject{
    public static void main(String[] args){

        Employee emp_1 = new Employee();
        emp_1.setName("Kishore");
        emp_1.setSalary(18000);

        Employee emp_2 = new Employee();
        emp_2.setName("Raj");
        emp_2.setSalary(100000);
        
        System.out.println(emp_1.getSalary());
        System.out.println(emp_2.getSalary());
    }
}