package org.example;

import org.example.model.Note;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BeanFactory context = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Note note = (Note)context.getBean("note");
        JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
        jdbcTemplate.update("Insert into note (content) values ('sample data 1')");
        System.out.println(note);
    }
}
