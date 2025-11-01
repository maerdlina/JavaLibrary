package builder;

import builder.Computer;
import builder.ComputerBuilder;

public class ComputerExample {
    public static void main(String[] args) {
        // Пример 1: Полноценный игровой компьютер
        Computer gamingPc = new ComputerBuilder("Intel Core i9", 64, 2048)
                .withGpu("NVIDIA RTX 4090")
                .withOs("Windows 11 Pro")
                .build();

        System.out.println("Игровой ПК: " + gamingPc);

        // Пример 2: Простой офисный компьютер (без GPU и OS)
        Computer officePc = new ComputerBuilder("Intel Core i3", 8, 256)
                .build();

        System.out.println("Офисный ПК: " + officePc);

        // Пример 3: Компьютер только с ОС (без видеокарты)
        Computer linuxPc = new ComputerBuilder("AMD Ryzen 7", 32, 1024)
                .withOs("Ubuntu 22.04")
                .build();

        System.out.println("Linux ПК: " + linuxPc);

        // Попытка изменить объект — НЕВОЗМОЖНА!
        // gamingPc.ram = 128; ← ОШИБКА КОМПИЛЯЦИИ! Поля final и нет сеттеров.
    }
}
