package singleton.simple;

public class SimpleExample {
    public static void main(String[] args) {
        // Example for Способ 1 и Способ 2
        /*Simple db1 = Simple.getInstance();
        System.out.println("db1: " + db1);
        Simple db2 = Simple.getInstance();
        System.out.println("db2: " + db2);

        System.out.println(db1 == db2);*/

        // Example for Способ 3
        SimpleEnum db = SimpleEnum.INSTANCE;
        db.connect();
    }

}
