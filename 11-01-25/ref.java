interface oper{
    int sum(int i,int j);
}

public class ref {
    public static void main(String[] args) {
        oper d=ref::add;
    }
    static int add(int a,int b){
        return a+b;
    }
    
}
// target type in method referance