package decorator;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:33
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
