package factoryMethod;

import factoryMethod.simple.Document;

public class DocumentFactory {
    public static Document createDocument(String type) {
        switch (type.toUpperCase()) {
            case "PDF": return new PdfDocument();
            case "WORD": return new WordDocument();
            default: throw new IllegalArgumentException("Unknown document type");
        }
    }
}
