package ProjectCalculator.src;

public class Division implements Operation {
    @Override
    public double calculateResult(double left, double right) {
        if (right == 0) throw new UnsupportedOperationException("Cannot divide by zero");
        return left / right;
    }
}