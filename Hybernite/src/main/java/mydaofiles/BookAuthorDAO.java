package mydaofiles;

import mypojos.Book;
import mypojos.Author;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class BookAuthorDAO {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void addBookWithAuthor(String title, String authorName) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Book book = new Book();
        book.setTitle(title);

        Author author = new Author();
        author.setName(authorName);

        book.getAuthors().add(author);
        author.getBooks().add(book);

        session.save(book);
        session.save(author);

        tx.commit();
        session.close();
    }

    // Add viewAll(), deleteById(), etc. as needed
}
