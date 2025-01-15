public class mcalling {
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
    public static void main(String[] args) {
        mcalling.m1();
        new mcalling().m2();
        m1();
        new mcalling().m2();
    }
}
