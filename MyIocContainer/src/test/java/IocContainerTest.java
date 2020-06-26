import Car.Renault;
import Car.Toyota;
import User.User;
import User.UserA;
import User.UserB;
import org.junit.Before;
import org.junit.Test;

public class IocContainerTest {

    private IoCContainer ioCContainer = new IoCContainer();

    @Before
    public void beforeTest(){
        //被依赖的Bean优先创建
        ioCContainer.setBean(Renault.class, "Renault");
        ioCContainer.setBean(Toyota.class, "Toyota");
        ioCContainer.setBean(UserA.class, "UserA", "Renault");
        ioCContainer.setBean(UserB.class, "UserB", "Toyota");
    }

    @Test
    public void test(){
        User userA = (User) ioCContainer.getBean("UserA");
        User userB = (User) ioCContainer.getBean("UserB");
        userA.goHome();
        userB.goHome();
    }
}
