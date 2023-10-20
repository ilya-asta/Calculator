package ComplexNumber;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double real = this.realPart + other.realPart;
        double imaginary = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double real = (this.realPart * other.realPart) - (this.imaginaryPart * other.imaginaryPart);
        double imaginary = (this.realPart * other.imaginaryPart) + (this.imaginaryPart * other.realPart);
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        if (other.realPart == 0 && other.imaginaryPart == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        double denominator = Math.pow(other.realPart, 2) + Math.pow(other.imaginaryPart, 2);
        double real = ((this.realPart * other.realPart) + (this.imaginaryPart * other.imaginaryPart)) / denominator;
        double imaginary = ((this.imaginaryPart * other.realPart) - (this.realPart * other.imaginaryPart)) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}
