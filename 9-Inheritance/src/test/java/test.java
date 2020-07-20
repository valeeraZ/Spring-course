import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MemberA memberA = context.getBean("memberA",MemberA.class);
        System.out.println("memberA = " + memberA);
        MemberB memberB = context.getBean("memberB",MemberB.class);
        System.out.println("memberB = " + memberB);
    }
}
