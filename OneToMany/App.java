package com.OneToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Department.class);
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory factory = cfg.buildSessionFactory();

        Department department = new Department();
        department.setName("IT Department");

        Employee emp1 = new Employee();
        emp1.setName("John Doe");

        Employee emp2 = new Employee();
        emp2.setName("Jane Smith");

        department.addEmployee(emp1);
        department.addEmployee(emp2);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(department);

        transaction.commit();
        session.close();
        factory.close();
    }
}

