import com.example.di.AnotherBean;
import com.example.di.Bean;
import com.example.di.MyConfiguration;
import com.example.scope.TestBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class test {
    /**
     * Test of Dependency Injection by Annotations
     */
    @Test
    public void testDI(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean = " + bean);
        System.out.println("bean.getStringList() = " + bean.getStringList());
        System.out.println("bean.getIntegerMap() = " + bean.getIntegerMap());
        System.out.println("bean.getString() = " + bean.getString());
        AnotherBean anotherBean = bean.getContext().getBean("anotherBean", AnotherBean.class);
        System.out.println("anotherBean = " + anotherBean);
    }

    /**
     * Test of Custom Scope
     */
    @Test
    public void testScope(){
        ApplicationContext context = new AnnotationConfigApplicationContext(com.example.scope.MyConfiguration.class);
        for (int i = 0; i <10 ; i++) {
            TestBean testBean = context.getBean("testBean",TestBean.class);
            System.out.println("testBean = " + testBean);
        }
    }

    /**
     * Test of Lookup Method Injection
     */
    @Test
    public void testLookup(){
        ApplicationContext context = new AnnotationConfigApplicationContext(com.example.scope.MyConfiguration.class);
        TestBean testBean = context.getBean("testBean",TestBean.class);
        for (int i = 0; i <10 ; i++) {
            testBean.printAnotherBean();
        }
    }

    /**
     * Test of lifecycle
     */
    @Test
    public void testLifecycle(){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(com.example.lifecycle.MyConfiguration.class);
        System.out.println("context init");
        context.close();
    }
}
