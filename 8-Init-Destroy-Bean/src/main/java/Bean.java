import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean implements InitializingBean, DisposableBean {

    public void destroy() throws Exception {
        System.out.println("接口-执行destroy方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("接口-执行afterPropertiesSet方法");
    }

    public void initMethod() {
        System.out.println("XML配置-执行init-method方法");
    }

    public void destroyMethod() {
        System.out.println("XML配置-执行destroy-method方法");
    }
}
