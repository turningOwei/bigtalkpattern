package decorator;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:40
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation(){
        super.Operation();
        AddeBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    //本类独有，区别于ConcreteDecoratorA
    private void AddeBehavior(){}
}
