interface mylogic{
    boolean test(int n);
}
class arrayope{
    static void showarray(int ar[], mylogic ref){
        for (int a:ar) {
            if(ref.test(a)){
                System.out.println(""+a);
            }
        }
        System.out.println("");
    }
}

public class demo4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        arrayope.showarray(a,(int n)->{return true;});
        arrayope.showarray(a,(int n)->{return n%2==0;});
        arrayope.showarray(a,(int n)->{
            if(n==1)
            return false;
            for (int i = 2; i <=n/2; i++){
                if(n%i==0)
                return false;
            }
            return true;
        });

    }
    
}
