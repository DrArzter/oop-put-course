package ProjectCalculator.src;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Character, Operation> operationMap = new HashMap<>();
    public Calculator(double firstNum, double secondNum) {
        operationMap.put('+', new Addition(firstNum, secondNum));
        operationMap.put('-', new Subtraction(firstNum, secondNum));
        operationMap.put('*', new Multiplication(firstNum, secondNum));
        operationMap.put('/', new Division(firstNum, secondNum));
        operationMap.put('%', new Modulo(firstNum, secondNum));
        operationMap.put('^', new Exponential(firstNum, secondNum));
        
    }

    public double Calculate(char operation) {
        Operation operationMapValue = operationMap.getOrDefault(operation,new NoOperationFound(operation));
        return operationMapValue.Calculate();
    }
}