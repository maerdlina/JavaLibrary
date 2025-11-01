package singleton.simple;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonThreadSafetyTest {
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 100;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        var instances = new ConcurrentHashMap<Simple, Boolean>();

        // Запускаем 100 потоков, каждый вызывает getInstance()
        for (int i = 0; i < threadCount; i++) {
            executor.submit(() -> {
                Simple db = Simple.getInstance();
                instances.put(db, true);
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Уникальных экземпляров: " + instances.size());
        // Ожидаем: 1
    }
}