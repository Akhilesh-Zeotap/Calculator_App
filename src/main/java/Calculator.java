import java.lang.Math;

public class Calculator {
    public int add(int x,int y){
        return x+y;
    }

    public int subtract(int x,int y) {
        return x - y;
    }

    public int multiply(int x,int y){
        return x*y;
    }

    public double divide(int x,int y){
        if(y == 0){
            throw new IllegalArgumentException("Can not divide by zero ;)");
        }
        return (double) x/y;
    }

    public double squareRoot(int x){
        if(x < 0){
            throw new IllegalArgumentException("No real roots of negative numbers ;)");
        }
        return Math.sqrt(x);
    }
}
