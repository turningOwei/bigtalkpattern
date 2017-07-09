package strategy;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/29 21:59
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStartegyA());
        context.contextInterface();
        context = new Context(new ConcreteStartegyB());
        context.contextInterface();
        context = new Context(new ConcreteStartegyC());
        context.contextInterface();
    }
}
