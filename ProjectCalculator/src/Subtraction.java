package ProjectCalculator.src;

class Subtraction implements Operation {
    private final double firstNum;
    private final double secondNum;
    Subtraction(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
        
    @Override
    public double Calculate() {
        return firstNum - secondNum;
    }
}