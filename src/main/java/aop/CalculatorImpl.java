package aop;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/12 9:59
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
