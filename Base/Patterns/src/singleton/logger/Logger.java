package singleton.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    // 1. Единственный экземпляр
    private static Logger instance;

    // 2. Файл для записи
    private FileWriter writer;

    // 3. Приватный конструктор
    private Logger(){
        try{
            writer = new FileWriter("app.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 4. Глобальная точка доступа
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    // 5. Метод для записи лога
    public void log(String msg){
        try{
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                    .format(new Date());
            writer.write("[" + timeStamp + "] " + msg + "\n");
            writer.flush();
        } catch (IOException e){
            System.err.println("Error writing log: " + e.getMessage());
        }
    }

    // 6. Закрытие файла (можно вызвать при завершении программы)
    public  void close(){
        try{
            writer.close();
        } catch (IOException e) {
            System.err.println("Error closing log: " + e.getMessage());
        }
    }
}
