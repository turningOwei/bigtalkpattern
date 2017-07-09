package decorator;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:42
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        //a.setComponent(concreteComponent);
        b.setComponent(concreteComponent);
        b.Operation();
    }
}
