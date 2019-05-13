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

    // https://sourcemaking.com/refactoring/inline-temp
    // inline temp
    public double pow(int x, int y) {
        double double_x = (double)x;
        double double_y = (double)y;
        double result;

        result = Math.pow(double_x,double_y);

        return result;
    }

    //    이걸로 바꾸기 가능
    //    public double pow(int x, int y) {
    //        return Math.pow((double)x,(double)y);
    //    }


}
