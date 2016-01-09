import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Uhsarp on 1/8/2016.
 */
public class HelloWorld {

    public static void main(String args[])
    {
        System.out.println("Fifth change Hello world");


        ApplicationContext context =
                new ClassPathXmlApplicationContext("dfasdfasdf.xml");


Shape shape= (Shape) context.getBean("shape");
        shape.draw();

    }
}
