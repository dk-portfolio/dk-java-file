class single{
    private String name;
    void set(String name){
        this.name=name;
    }
    void show(){
        System.out.println(name);
    }
}
class employee extends single{
    private int id;
    void set(String name,int id){
        set(name);
        this.id=id;
    }
    void show(){
        super.show();
        System.out.println(id);
    }
}
public class display{
    public static void main(String[] args) {
        employee e=new employee();
        e.set("ram", 101);
        e.show();
    }
}
