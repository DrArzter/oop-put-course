package ProjectCalculator.src;

class Addition implements Operation {
    private final double firstNum;
    private final double secondNum;
    Addition(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
        
    @Override
    public double Calculate() {
        return firstNum + secondNum;
    }
}