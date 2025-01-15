class foo {
    final int p;
    foo(int p){
        this.p=p;
    }
}
class instantvari{
    public static void main(String[] args) {
        foo f=new foo(100);
        System.out.println(f.p);
        foo g=new foo(200);
        System.out.println(g.p);
    }
}
