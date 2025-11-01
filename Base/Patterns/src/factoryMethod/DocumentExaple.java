package factoryMethod;

import factoryMethod.simple.Document;
import factoryMethod.simple.DocumentFactory;

public class DocumentExaple {
    public static void main(String[] args) {
        Document doc = DocumentFactory.createDocument("PDF");
        doc.open(); // "Opening PDF"
    }

}
