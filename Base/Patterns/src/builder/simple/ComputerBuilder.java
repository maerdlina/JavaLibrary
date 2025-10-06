package builder.simple;

// =============== 2. Строитель: ComputerBuilder ===============
class ComputerBuilder {
    // Поля — НЕ final, потому что мы их настраиваем по шагам
    String cpu;
    int ram;
    int storage;
    String gpu;    // опционально
    String os;     // опционально

    // Конструктор Builder'а: принимает ОБЯЗАТЕЛЬНЫЕ параметры
    public ComputerBuilder(String cpu, int ram, int storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    // Опциональные настройки — каждый метод возвращает this (для цепочки)
    public ComputerBuilder withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder withOs(String os) {
        this.os = os;
        return this;
    }

    // Финальный метод: создаёт неизменяемый Computer
    public Computer build() {
        return new Computer(this); // передаём самого себя в приватный конструктор
    }
}
