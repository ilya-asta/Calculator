package Operation;

import ComplexNumber.ComplexNumber;
import Logging.Logger;

import java.util.Scanner;

public class ComplexCalculatorApp {
    public void run(ComplexNumber number1, ComplexNumber number2, ComplexCalculation calculator, Logger logger){
        Scanner scanner = new Scanner(System.in);

        while(true){
                System.out.println("1. Сложение чисел");
                System.out.println("2. Умножение чисел");
                System.out.println("3. Деление чисел");
                System.out.println("Выберите операцию (введите номер операции):");

                int operation = scanner.nextInt();
                // Выполнение операции в зависимости от выбранного номера
                switch (operation) {
                    case 1:
                        performAddition(number1, number2, calculator, logger);
                        break;
                    case 2:
                        performMultiplication(number1, number2, calculator, logger);
                        break;
                    case 3:
                        performDivision(number1, number2, calculator, logger);
                        break;
                    default:
                        logger.warning("Invalid operation number");
                        break;
                }
                System.out.println("Хотите продолжить? (введите 'да' для продолжения):");
                String answer = scanner.next();
                if (!answer.equalsIgnoreCase("да")) {
                    break;
                }
        }
    }

    private void performAddition(ComplexNumber number1, ComplexNumber number2, ComplexCalculation calculator, Logger logger){
        ComplexNumber sum = calculator.add(number1, number2);
        logger.info("Сумма чисел: " + sum.getRealPart() + " + " + sum.getImaginaryPart() + "i");
    }
    private void performMultiplication(ComplexNumber number1, ComplexNumber number2, ComplexCalculation calculator, Logger logger){
        ComplexNumber product = calculator.multiply(number1, number2);
        logger.info("Произведение чисел: " + product.getRealPart() + " + " + product.getImaginaryPart() + "i");
    }
    private void performDivision(ComplexNumber number1, ComplexNumber number2, ComplexCalculation calculator, Logger logger){
        try {
            ComplexNumber quotient = calculator.divide(number1, number2);
            logger.info("Частное чисел: " + quotient.getRealPart() + " + " + quotient.getImaginaryPart() + "i");
        } catch (IllegalArgumentException e) {
            logger.error(e.getMessage());
        }
    }
}
