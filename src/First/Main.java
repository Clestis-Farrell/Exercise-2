package First;
class circle{
    double r;
    double Pi = 3.14;
    void show(){
        System.out.print("="+r*Pi);
    }
}
public class Main {
    public static void main(String[] args) {
        circle ans = new circle();
        ans.r = 2.0;
        ans.show();
    }
}
