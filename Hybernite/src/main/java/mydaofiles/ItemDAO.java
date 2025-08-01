package mydaofiles;

import mypojos.Item;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ItemDAO {
    SessionFactory factory;

    public ItemDAO() {
        factory = new Configuration().configure("wiprohibernate.cfg.xml").buildSessionFactory();
    }

    public void addItem(String name, double price) {
        Item item = new Item();
        item.setName(name);
        item.setPrice(price);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(item);
        tx.commit();
        session.close();
        System.out.println("Item added");
    }

    public List<Item> viewAllItems() {
        Session session = factory.openSession();
        List<Item> list = session.createQuery("from Item", Item.class).list();
        session.close();
        return list;
    }

    // You can add update, delete, getById later
}
