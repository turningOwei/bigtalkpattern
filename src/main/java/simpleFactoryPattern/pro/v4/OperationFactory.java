package simpleFactoryPattern.pro.v4;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/27 20:33
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return  operation;
    }
}
