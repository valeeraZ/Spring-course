import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //构造方式生成Bean
        Bean1 bean1 = context.getBean("bean1",Bean1.class);
        System.out.println("bean1 = " + bean1);

        //通过静态工厂方式生成Bean
        Bean2 bean2 = context.getBean("bean2",Bean2.class);
        System.out.println("bean2 = " + bean2);

        //通过实例化方式生成Bean
        Bean3 bean3 = context.getBean("bean3",Bean3.class);
        System.out.println("bean3 = " + bean3);
        
        //bean的别名
        Bean1 bean1_1 = context.getBean("bean1_1",Bean1.class);
        System.out.println("bean1_1 = " + bean1_1);
        Bean1 bean1_2 = context.getBean("bean1_2",Bean1.class);
        System.out.println("bean1_2 = " + bean1_2);
        Bean1 bean1_3 = context.getBean("bean1_3",Bean1.class);
        System.out.println("bean1_3 = " + bean1_3);
    }

}
