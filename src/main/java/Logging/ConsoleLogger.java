package Logging;

public class ConsoleLogger implements Logger{
    @Override
    public void info(String massage) {
        System.out.println("INFO: " + massage);
    }

    @Override
    public void warning(String massage) {
        System.out.println("WARNING: " + massage);
    }

    @Override
    public void error(String massage) {
        System.out.println("ERROR: " + massage);
    }
}
