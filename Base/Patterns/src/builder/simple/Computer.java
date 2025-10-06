package builder.simple;

// =============== 1. Основной класс: Computer ===============
public class Computer {
    // Все поля — final → объект нельзя изменить после создания
    private final String cpu;
    private final int ram;          // в гигабайтах
    private final int storage;      // в гигабайтах
    private final String gpu;       // видеокарта (может быть null)
    private final String os;        // операционная система (может быть null)

    // Приватный конструктор — только ComputerBuilder может создать Computer
    Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    // Геттеры — только для чтения
    public String getCpu() { return cpu; }
    public int getRam() { return ram; }
    public int getStorage() { return storage; }
    public String getGpu() { return gpu; }
    public String getOs() { return os; }

    // Для красивого вывода
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram + "GB" +
                ", storage=" + storage + "GB" +
                ", gpu='" + gpu + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}