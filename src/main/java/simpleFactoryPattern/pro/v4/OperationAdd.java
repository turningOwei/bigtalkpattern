package simpleFactoryPattern.pro.v4;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/27 20:29
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class OperationAdd extends Operation{
    @Override
    public double getResult(){
        double result = 0;
        result = get_numberA() + get_numberB();
        return result;
    }
}
