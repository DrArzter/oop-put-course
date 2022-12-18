package ProjectCalculator.src;

import java.util.InputMismatchException;

class NoOperationFound implements Operation {
    private char sign;
    NoOperationFound(char sign){
        this.sign = sign;
}

    @Override
    public double Calculate() {
        throw new InputMismatchException("Invalid operator sign: " + sign);
    }
}