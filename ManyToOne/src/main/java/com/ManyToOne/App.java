package com.ManyToOne;

/**
 * Hello world!
 *
 */



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create a new product
        Product product = new Product();
        product.setName("Laptop");
        session.save(product);

        // Create a new purchase
        Purchase purchase = new Purchase();
        purchase.setQuantity(5);
        purchase.setProduct(product);
        session.save(purchase);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
