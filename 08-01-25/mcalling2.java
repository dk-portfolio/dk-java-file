public class mcalling2 {
    static void m1(){
        System.out.println("hi");
    }
    void m2(){
        System.out.println("dk");
    }
    void m3(){
        m1();
        m2();
    }
    public static void main(String[] args) {
        new mcalling2().m3();
    }
    
}
