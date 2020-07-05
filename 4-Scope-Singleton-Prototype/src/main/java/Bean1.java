public abstract class Bean1 {

    public void printBean2(){
        System.out.println("Bean2 = " + createBean2());
    }

    protected abstract Bean2 createBean2();
}
