import java.util.Scanner;

public class Calculator {
    public double plus(int x, int y) {
        return x + y;
    }

    public double minus(int x, int y) {
        return x - y;
    }

    public double mul(int x, int y) {
        return x * y;
    }

    public double div(int x, int y) {
        return x / y;
    }


    public int factorial(int x) {
        int result = 1;

        for (int i = x; i >= 1; i--) {
            result = result * i;
        }

        return result;
    }

    public int factorialAfter(int x) {
        if (x <= 1)
            return x;
        else
            return factorialAfter(x - 1) * x;
    }


    public double sqrt(int x) {
        double want_sqrt = Math.sqrt(x);
        return want_sqrt;
    }


    public double pow(int x, int y) {
        double double_x = (double) x;
        double double_y = (double) y;
        double result;

        result = Math.pow(double_x, double_y);

        return result;
    }

    public double powAfter(int x, int y) {
        return Math.pow((double) x, (double) y);
    }

    public double CircleArea(int x) {
        return x * x * 3.14;
    }

    static final double PI_Circle = 3.14;

    public double CircleAreaAfter(int x) {
        return x * x * PI_Circle;
    }

    public int randomDice() {
        double dice = (Math.random() * 6);
        int dice_ = (int) dice;
        return dice_;
    }

    public int RectangleArea(int x, int y) {
        int area = (int) mul(x, y);
        return area;
    }

}
