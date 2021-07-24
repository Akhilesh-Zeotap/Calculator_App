import java.lang.Math;



public class Calculator {
    long maximum = Integer.MAX_VALUE;
    long minimum = Integer.MIN_VALUE;

    public int add(int x,int y){
        return Math.addExact(x,y);
    }

    public int subtract(int x,int y) {
//        long result = x-y;
//        if (result > maximum || result < minimum){
//            throw new IllegalArgumentException("Integer Overflow");
//        }
//        return x - y;
        return Math.subtractExact(x,y);
    }

    public int multiply(int x,int y){
//        long result = x*y;
//        if (result > maximum || result<minimum){
//            throw new IllegalArgumentException("Integer Overflow");
//        }
//        return x * y;

        return Math.multiplyExact(x,y);
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
