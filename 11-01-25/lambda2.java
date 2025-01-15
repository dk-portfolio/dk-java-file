interface my{
    boolean test(int val);
}

public class lambda2 {
    public static void main(String[] args) {
        my mp=(int v)->{return v%2==0;};
        System.out.println(mp.test(12));
    }
    
}
