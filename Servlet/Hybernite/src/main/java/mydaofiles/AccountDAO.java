package mydaofiles;

import mypojos.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class AccountDAO {
    private static final SessionFactory factory = new Configuration().configure("wiprohibernate.cfg.xml").buildSessionFactory();

    public void addAccount(Account acc) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(acc);
        tx.commit();
        session.close();
    }

    public List<Account> getAllAccounts() {
        Session session = factory.openSession();
        List<Account> list = session.createQuery("from Account", Account.class).list();
        session.close();
        return list;
    }

    public void deleteAccount(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Account acc = session.get(Account.class, id);
        if (acc != null) {
            session.delete(acc);
        }
        tx.commit();
        session.close();
    }
}
