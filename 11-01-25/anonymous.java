interface talk{
    void sayhello(String name);
}
public class anonymous{
    public static void main(String[] args) {
        talk ref=new talk() {
            public void sayhello(String name){
                System.out.println("hello"+name);
            }
        };
        ref.sayhello("DK");
    }
}