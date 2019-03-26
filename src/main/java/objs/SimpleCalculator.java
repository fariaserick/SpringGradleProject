package objs;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getFirstNumber() {
        return this.firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    
    public double getAdditionResult() {
        double result = getFirstNumber() + getSecondNumber();
        return result;
    }
    
    public double getSubtractionResult() {
        double result = getFirstNumber() - getSecondNumber();
        return result;
    }
    
    public double getDivisionResult() {
    	if(getSecondNumber() == 0)
            return 0;
        double result = getFirstNumber() / getSecondNumber();
        return result;
    }
    
    public double getMultiplicationResult() {
        double result = getFirstNumber() * getSecondNumber();
        return result;
    }
}