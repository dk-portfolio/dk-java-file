interface  drawable{
    void draw();
}
class circle implements drawable{
    public  void draw(){
        System.out.println("drawing circle");
    }
}
public class draw {
    public static void main(String[] args) {
        drawable d=new circle();
        d.draw();
    }
   
    
    
}
