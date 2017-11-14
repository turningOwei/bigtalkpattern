package template;

/**
 * Created by 002465 on 2017/10/17.
 */
public abstract class AbstractTemplate {
    public void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();

        concreteMethod();
    }

    //基本方法(已经实现)
    private void concreteMethod() {
        //业务相关的代码
    }

    //基本空方法
    private void hookMethod() {
    }

    //基本方法的声明(由子类实现)
    protected abstract void abstractMethod();
}
