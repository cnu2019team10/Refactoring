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


    // Substitute algorithm
    // 반복문으로 구현한 알고리즘을 재귀로 수정

    public int factorial_origin(int n) {
        int result = 1;

        for (int i = n; i >= 1; i--) {
            result = result * i;
        }

        return result;
    }


    public int factorial_modify(int n) {
        if (n <= 1)
            return n;
        else
            return factorial_modify(n-1) * n;
    }

}
