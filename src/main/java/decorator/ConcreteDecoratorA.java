package decorator;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:37
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class ConcreteDecoratorA extends Decorator {
    //本类独有，区别于ConcreteDecoratorB
    private String addedState;

    @Override
    public void Operation(){
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
