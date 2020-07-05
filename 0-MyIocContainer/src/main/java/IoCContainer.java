import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
1.实例化bean
2.保存bean
3.提供bean
4.每一个bean要产生一个唯一的id与之相对应
 */
public class IoCContainer {
    private Map<String, Object> beans;

    IoCContainer(){
        beans = new ConcurrentHashMap<String, Object>();
    }
    /**
     * 根据beanId获取bean
     * @param beanId beanId
     * @return 获取的bean
     */
    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    /**
     * 委托IoC容器创建bean
     * @param clazz 要创建的bean的类
     * @param beanId beanId
     * @param paramBeanIds 要创建的bean的类的构造方法所需要的beanIds
     */
    public void setBean(Class<?> clazz, String beanId, String... paramBeanIds){
        //1.组装构造方法所需要的参数值
        Object[] paramValues = new Object[paramBeanIds.length];
        for(int i = 0; i < paramBeanIds.length; i++){
            paramValues[i] = beans.get(paramBeanIds[i]);
        }
        //2.调用构造方法实例化bean
        Object bean = null;
        for (Constructor<?> constructor : clazz.getConstructors()) {
            try {
                bean = constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
            //不处理exception，因为每个bean可能用到的构造方法签名不同，最终总会实例化bean
        }

        if(bean == null){
            throw new RuntimeException("找不到合适的构造方法实例化bean");
        }
        //3.将实例化的bean放入map beans 中
        beans.put(beanId, bean);
    }
}
