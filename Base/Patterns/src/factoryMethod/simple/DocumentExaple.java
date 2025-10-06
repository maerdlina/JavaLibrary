package factoryMethod.simple;

public class DocumentExaple {
    public static void main(String[] args) {
        Document doc = DocumentFactory.createDocument("PDF");
        doc.open(); // "Opening PDF"
    }

}
