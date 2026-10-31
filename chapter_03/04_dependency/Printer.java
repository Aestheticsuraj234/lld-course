public class Printer {
    // No Document field here! The printer does NOT keep the document.

    // Printer DEPENDS ON Document: it only uses it inside this one method
    public void print(Document doc) {
        System.out.println("Printing '" + doc.getTitle() + "': " + doc.getContent());
    }
}