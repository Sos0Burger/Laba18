import java.util.Scanner;

class Example{
    private static Example ex = new Example();
    private double x;
    private double y;
    private Example(){

    }
    public static Example getInstance(){
        return ex;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double solve(){
        return (2 * x) + (3 / y);
    }
}

public class Main {
    public static void main(String[] args) {
        Example ex = Example.getInstance();
        Scanner in = new Scanner(System.in);
        ex.setX(in.nextDouble());
        ex.setY(in.nextDouble());
        System.out.println(ex.solve());
    }
}