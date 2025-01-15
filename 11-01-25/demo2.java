interface talk{
    void sayhello(String name);
}
class talkimple implements talk{
    public void sayhello(String name){
        System.out.println("welcome!!"+name);
    }
}

public class demo2{
    static void takaction(talk ref){
        ref.sayhello("DK");
    }
    public static void main(String[] args) {
        talk t=new talkimple();
        demo2.takaction(t);
    }
    
}
