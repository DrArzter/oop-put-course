package project_1.src;

class Exponential implements Operation {
    private final double firstNum;
    private final double secondNum;
    Exponential(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
        
    @Override
    public double Calculate() {
        return Math.pow(firstNum, secondNum);
    }
}