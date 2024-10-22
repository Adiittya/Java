class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display method in Book class
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Reference_Book extends Book {
    String subject;

    Reference_Book(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

class Magazine extends Book {
    String publicationDate;

    Magazine(String title, String author, String publicationDate) {
        super(title, author);
        this.publicationDate = publicationDate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Publication Date: " + publicationDate);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Book Title", "Book Author");
        Reference_Book refBook = new Reference_Book("Ref Book Title", "Ref Book Author", "Mathematics");
        Magazine magazine = new Magazine("Magazine Title", "Magazine Author", "October 2024");

        book.display();
        System.out.println();
        refBook.display();
        System.out.println();
        magazine.display();
    }
}
