package com.OneToOne;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
      
    	Question q1 = new Question();
    	q1.setQuestionId(101);
    	q1.setQuestion("What is java");
    	
    	Answer a1 = new Answer();
    	a1.setAnswerId(201);
    	a1.setAnswer("Java is a programnming language");
    	
    	
    	q1.setAnswer(a1);
    	
    	Session s = factory.openSession();
        s.save(q1);
        s.save(a1);
        
        Transaction ts = s.beginTransaction();
        ts.commit();
        s.close();
    	
    			
    }
}