package ProjectCalculator.src;

public class Multiplication implements Operation {
    @Override
    public double calculateResult(double left, double right) {
        return left * right;
    }
}