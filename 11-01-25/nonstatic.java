// non static nested class

class employee{
    private String empName;
    class employeeValidator{
        boolean validate(){
            return empName !=null && !empName.isEmpty();
        }
    }
}
public class nonstatic {
    public static void main(String[] args) {
        employee.employeeValidator ref=new employee().new employeeValidator();
        boolean b=ref.validate();
        System.out.println(b);
    }
    
}
