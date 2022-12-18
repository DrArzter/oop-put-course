package ProjectCalculator.src;

class Modulo implements Operation {
    private final double operand1;
    private final double operand2;
    Modulo(double firstNum, double secondNum){
        this.operand1 = firstNum;
        this.operand2 = secondNum;
    }
    @Override
    public double Calculate() {
        return operand1 % operand2;
    }
}