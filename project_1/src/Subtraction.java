package ProjectCalculator.src;

public class Subtraction implements Operation {
    @Override
    public double calculateResult(double left, double right) {
        return left - right;
    }
}