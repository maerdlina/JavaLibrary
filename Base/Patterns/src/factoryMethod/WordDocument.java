package factoryMethod;

import factoryMethod.simple.Document;

public class WordDocument implements Document {
    public void open(){System.out.println("Opening Word");}
}
