interface operation {
    int sum(int i,int j);
}
public class lambda{
    public static void main(String[] args) {
        operation d=(i,j)->i+j;
    }
}
// lambada expression using