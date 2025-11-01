package factoryMethod;

import factoryMethod.simple.Document;

public class PdfDocument implements Document {
    public void open() { System.out.println("Opening PDF"); }
}
