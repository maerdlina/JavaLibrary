package singleton.logger;

public class LoggerExample {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Приложение запущено");
        logger.log("Пользователь вошёл в систему");
        logger.log("Выполнена оплата");

        // Даже если попросить ещё раз — получим тот же объект
        Logger logger2 = Logger.getInstance();
        System.out.println(logger == logger2); // true

        logger.close();
    }
}
