package com.ManyToMany;

import org.hibernate.Hibernate;
/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Configure Hibernate
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Course.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Initialize session and transaction
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create some courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Create some students
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Doe");

        // Establish many-to-many relationships
        student1.getCourses().add(course1);
        student1.getCourses().add(course2);

        student2.getCourses().add(course1);
        student2.getCourses().add(course3);

        // Save the students and courses to the database
        session.save(course1);
        session.save(course2);
        session.save(course3);

        session.save(student1);
        session.save(student2);

        // Commit the transaction
        transaction.commit();

        // Begin a new transaction for querying and updating
        transaction = session.beginTransaction();

        // Query and display all students
        Query<Student> studentQuery = session.createQuery("from Student", Student.class);
        List<Student> students = studentQuery.list();

        System.out.println("Students and their enrolled courses:");
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            for (Course course : student.getCourses()) {
                System.out.println(" - Enrolled in: " + course.getTitle());
            }
        }

        // Update relationships
        Student student3 = new Student("Mike Ross");
        student3.getCourses().add(course2);
        student3.getCourses().add(course3);
        session.save(student3);

        // Remove a course from a student
        student1.getCourses().remove(course1);
        session.update(student1);

        // Commit the transaction
        transaction.commit();

        // Begin a new transaction for deleting
        transaction = session.beginTransaction();

        // Delete a student
        session.delete(student2);

        // Commit the transaction and close the session
        transaction.commit();
        session.close();

        // Close the Hibernate session factory
        sessionFactory.close();
    }
}
