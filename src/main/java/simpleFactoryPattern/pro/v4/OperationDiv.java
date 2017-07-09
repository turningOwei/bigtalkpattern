package simpleFactoryPattern.pro.v4;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/27 20:32
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class OperationDiv extends Operation{
    @Override
    public double getResult() throws Exception {
        double result = 0;
        if(get_numberB() == 0)
            throw  new Exception("除数不能为0");
        result = get_numberA() / get_numberB();
        return result;
    }
}
