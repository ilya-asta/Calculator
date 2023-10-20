package Operation;

import ComplexNumber.ComplexNumber;

public class ComplexCalculator implements ComplexCalculation{

    @Override
    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        return number1.add(number2);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        return number1.multiply(number2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        if (number2.getRealPart() == 0 && number2.getImaginaryPart() == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return number1.divide(number2);
    }
}
