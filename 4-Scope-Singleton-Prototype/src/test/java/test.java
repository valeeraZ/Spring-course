import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean1 bean1 = context.getBean("bean1",Bean1.class);
        bean1.printBean2();
        bean1.printBean2();
        Bean1 bean1_1 = context.getBean("bean1",Bean1.class);
        bean1_1.printBean2();
        bean1_1.printBean2();
        System.out.println("(bean1 == bean1_1) = " + (bean1 == bean1_1));
    }
}
