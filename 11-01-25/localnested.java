// local nested class 
class employee{
    private String empName;
    boolean validate(){
        class employeeValidator{
            boolean validate(){
                return empName !=null && !empName.isEmpty();
            }
        }
        employeeValidator e=new employeeValidator();
        return e.validate();
    }
}

public class localnested {
    public static void main(String[] args) {
        employee ref =new employee();
        boolean b=ref.validate();
        System.out.println(b);
    }
}
