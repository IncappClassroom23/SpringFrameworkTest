package org.example;

import org.example.model.Note;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

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
        System.out.println(note);
    }
}
