class emp{
    private String empName;
    static class employeeValidator{
        boolean validate (emp e){
            return e.empName!=null&& !e.empName.isEmpty();
        }
    }
}
public class employee {
    public static void main(String[] args) {
        emp.employeeValidator ref=new emp.employeeValidator();
        boolean b=ref.validate(new emp());
        System.out.println(b);
    }
}
// static nasted class