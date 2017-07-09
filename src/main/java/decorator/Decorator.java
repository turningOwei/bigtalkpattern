package decorator;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:34
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public abstract class Decorator extends Component  {
    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void Operation(){
        if(component != null){
            component.Operation();
        }
    }
}
