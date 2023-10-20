import Logging.ConsoleLogger;
import Logging.Logger;
import Operation.ComplexCalculator;
import ComplexNumber.*;
import Operation.ComplexCalculatorApp;
public class Main {
    public static void main(String[] args) {
        // Создание экземпляров комплексных чисел
        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(4, 5);

        ComplexCalculator calculator = new ComplexCalculator();
        ComplexCalculatorApp calculatorApp = new ComplexCalculatorApp();
        Logger logger = new ConsoleLogger();

        calculatorApp.run(number1,number2,calculator,logger);


//      __________________________________________________________________________________________________
//        Все что ниже это все что было раньше, я изначально в мейне все делал ))


        // Создание экземпляра класса ConsoleLogger
//        Scanner scanner = new Scanner(System.in);

//            while(true){
//                System.out.println("1. Сложение чисел");
//                System.out.println("2. Умножение чисел");
//                System.out.println("3. Деление чисел");
//                System.out.println("Выберите операцию (введите номер операции):");
//
//                int operation = scanner.nextInt();
//                // Выполнение операции в зависимости от выбранного номера
//                if (operation == 1) {
//                    ComplexNumber sum = calculator.add(number1, number2);
//                    logger.info("Сумма чисел: " + sum.getRealPart() + " + " + sum.getImaginaryPart() + "i");
//                } else if (operation == 2) {
//                    ComplexNumber product = calculator.multiply(number1, number2);
//                    logger.info("Произведение чисел: " + product.getRealPart() + " + " + product.getImaginaryPart() + "i");
//                } else if (operation == 3) {
//                    try {
//                        ComplexNumber quotient = calculator.divide(number1, number2);
//                        logger.info("Частное чисел: " + quotient.getRealPart() + " + " + quotient.getImaginaryPart() + "i");
//                    } catch (IllegalArgumentException e) {
//                        logger.error(e.getMessage());
//                    }
//                }
//                System.out.println("Хотите продолжить? (введите 'да' для продолжения):");
//                String answer = scanner.next();
//                if (!answer.equalsIgnoreCase("да")) {
//                    break;
//                }
//            }
//        // Выполнение операций над комплексными числами
//        ComplexNumber sum = calculator.add(number1, number2);
//        ComplexNumber product = calculator.multiply(number1, number2);
//        ComplexNumber quotient = calculator.divide(number1, number2);


            // Вывод результатов операций на консоль
//        logger.info("Сумма чисел: " + sum.getRealPart() + " + " + sum.getImaginaryPart() + "i");
//        logger.info("Произведение чисел: " + product.getRealPart() + " + " + product.getImaginaryPart() + "i");
//        logger.info("Частное чисел: " + quotient.getRealPart() + " + " + quotient.getImaginaryPart() + "i");
        }

}
