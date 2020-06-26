import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean",Bean.class);
        System.out.println("bean = " + bean);
    }
}
