package project_1.src;

public class Division implements Operation {
    private final double firstNum;
    private final double secondNum;
    Division(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
        
    @Override
    public double Calculate() {
        if (secondNum == 0) throw new UnsupportedOperationException("Cannot divide by zero");
        return firstNum / secondNum;
    }
}