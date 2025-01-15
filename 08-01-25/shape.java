import java.util.Scanner;
abstract class circle{
    float ar;
    abstract void area();
    void show(){
        System.out.println("area=" +ar);
    }
}
class retangle extends circle{
    void area(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        float length=sc.nextFloat();
        System.out.println("enter breath");
        float breath=sc.nextFloat();
        ar=length*breath;
    }
}
class shape{
    public static void main(String[] args) {
        retangle r=new retangle();
        r.area();
        r.show();
    }
}