package ProjectCalculator.src;

class Multiplication implements Operation {
    private final double firstNum;
    private final double secondNum;
    Multiplication(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
        
    @Override
    public double Calculate() {
        return firstNum * secondNum;
    }
}
