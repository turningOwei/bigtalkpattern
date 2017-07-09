package simpleFactoryPattern.pro.v4;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/27 20:35
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class OperationClient {
    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.createOperate("+");
        operation.set_numberA(1d);
        operation.set_numberB(2d);
        double result = operation.getResult();
        System.out.println(result);
    }
}
