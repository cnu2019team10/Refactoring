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

    //https://sourcemaking.com/refactoring/replace-magic-number-with-symbolic-constant
    // 리팩토링 기술 중 Replace Magic Number with Symbolic Constant 사용함.
    public double CircleArea_before(int x){
        return x * x * 3.14;

        //이런식으로 PI값으로 잘 알려진 특별한 의미의 숫자값을 직접사용하고 있다면
        //아래처럼 해당 숫자값의 의미를 나타내는 이름을 가진 상수를 만들어 대체하는 것이 좋음.
    }

    static final double PI_circlerate = 3.14;  //3.14라는 값이 원주율임을 나타내줌.
    public double CircleArea_after(int x){
        return x * x * PI_circlerate;
    }
}
