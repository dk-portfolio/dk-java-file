class  light{
    private int wall;
    light(){
        System.out.println("no args light");
    }

    light(int wall) {
        System.out.println("parameter light");
    }
    
}
class tubelight extends light {
    private int length;
    // tubelight(){
    //     System.out.println("no args:tubelight");
    // }
    tubelight(int wall,int length){
        super( wall);
        System.out.println("parameter tubelight");
    }
}

public class main {
    public static void main(String[] args) {
        tubelight r=new tubelight(10, 20);
    }
}
