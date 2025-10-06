package singleton.simple;

public enum SimpleEnum {
    INSTANCE;

    public void connect() {
        System.out.println("Подключено к базе данных");
    }
}
