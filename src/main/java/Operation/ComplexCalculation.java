package Operation;

import ComplexNumber.ComplexNumber;

public interface ComplexCalculation {
    ComplexNumber add(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber divide(ComplexNumber number1, ComplexNumber number2);
}
