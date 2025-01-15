class arrayope{
    static void showarray(int ar[]){
        for (int a:ar) {
            System.out.println(""+a);
        }
        System.out.println("");

    }
}

public class demo3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        arrayope.showarray(a);
    }
}
